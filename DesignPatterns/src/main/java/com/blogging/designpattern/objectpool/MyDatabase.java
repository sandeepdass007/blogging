package com.blogging.designpattern.objectpool;

public class MyDatabase {

	private String connectionUrl;
	private String username;
	private String password;

	private MyDatabaseObjectPool objectPool = null;
	
	@SuppressWarnings("unused")
	private MyDatabase() {
		super();
	}

	/*
	 * Initializing MyDatabase object and also ObjectPool
	 * */
	public MyDatabase(String connectionUrl, String username, String password) {
		this.connectionUrl = connectionUrl;
		this.username = username;
		this.password = password;
		objectPool = new MyDatabaseObjectPool(this.connectionUrl, this.username, this.password);
	}

	public String queryData(final String query) {
		// fetch the connection object from pool
		DBConnection dbConnection = objectPool.getObject();
		while(dbConnection == null) {
			sleepThread(1000);
			dbConnection = objectPool.getObject();
		}
		System.out.println("Querying data with object - " + dbConnection);
		// query the data from database using this connection object
		final String queryResult = dbConnection.queryData(query);
		// inform the object pool that we do not need this object anymore
		objectPool.releaseObject(dbConnection);
		return queryResult;
	}
	
	private void sleepThread(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
