package com.blogging.designpattern.objectpool;

public class MyDatabaseObjectPool {

	private final int MAX_SIZE = 8;
	private int occupiedSize = 0;
	private int availableSize = 0;
	private final DBConnection[] availableConnections = new DBConnection[MAX_SIZE];
	private final DBConnection[] occupiedConnections = new DBConnection[MAX_SIZE];

	private String connectionUrl;
	private String username;
	private String password;

	@SuppressWarnings("unused")
	private MyDatabaseObjectPool() {
		super();
	}

	public MyDatabaseObjectPool(String connectionUrl, String username, String password) {
		super();
		this.connectionUrl = connectionUrl;
		this.username = username;
		this.password = password;
	}

	public DBConnection getObject() {
		// no object is available to deal with
		if(availableSize == 0 && occupiedSize == MAX_SIZE) {
			// ideally we should synchronize this block to keep the request in waiting state
			// but for the sake of simplicity we are moving this responsibility to the MyDatabase
			// to keep on sending requests until object is assigned to it.
			return null;
		} else if(availableSize == 0 && occupiedSize < MAX_SIZE) { // if there is no object available and there is a room to create a new one
			final DBConnection newDbConnection = new DBConnection(connectionUrl, username, password);
			assign(newDbConnection);
		}
		// assign one available object
		return assign();
	}

	public void releaseObject(final DBConnection dbConnection) {
		deAssign(dbConnection);
	}
	
	private void assign(DBConnection dbConnection) {
		for(int position = 0; position < MAX_SIZE; position++) {
			// any position which does not have any object, assign it "dbConnection"
			if(availableConnections[position] == null) {
				availableConnections[position] = dbConnection;
				availableSize++;
				break;
			}
		}
	}

	/*
	 * In this method we are checking of available slots and moving one reference of object
	 * from available to occupied
	 * */
	private DBConnection assign() {
		DBConnection toBeAssigned = null;
		for (int position = 0; position < MAX_SIZE; position++) {
			final DBConnection dbConnection = availableConnections[position];
			if (dbConnection != null) {
				toBeAssigned = dbConnection;
				for (int occupiedPosition = 0; occupiedPosition < MAX_SIZE; occupiedPosition++) {
					if (occupiedConnections[occupiedPosition] == null) {
						occupiedConnections[occupiedPosition] = toBeAssigned;
						availableConnections[position] = null;
						availableSize--;
						occupiedSize++;
						break;
					}
				}
			}
		}
		return toBeAssigned;
	}

	/*
	 * This method is reverse of assign. It move the reference to object from occupied to available
	 * */
	private void deAssign(DBConnection dbConnection) {
		for (int position = 0; position < MAX_SIZE; position++) {
			if (occupiedConnections[position] == dbConnection
					|| (occupiedConnections[position] != null && occupiedConnections[position].equals(dbConnection))) {
				occupiedConnections[position] = null;
				occupiedSize--;
				break;
			}
		}

		for (int position = 0; position < MAX_SIZE; position++) {
			if (availableConnections[position] == null) {
				availableConnections[position] = dbConnection;
				availableSize++;
				break;
			}
		}
	}
	
	/*
	 * When object is destroyed then finalize method is called. So before destroying
	 * the object pool, we are releasing the objects we kept for reusable purposes.
	 * */
	@Override
	protected void finalize() throws Throwable {
		// disposing available connections
		for(DBConnection dbConnection : availableConnections) {
			if(dbConnection != null) {
				dbConnection.dispose();
			}
		}
		
		// disposing occupied connections (if any)
		for(DBConnection dbConnection : occupiedConnections) {
			if(dbConnection != null) {
				dbConnection.dispose();
			}
		}
	}

}
