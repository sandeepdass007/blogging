package com.blogging.designpattern.objectpool;

public class DBConnection implements Disposable {

	private String connectionUrl;
	private String username;
	private String password;

	@SuppressWarnings("unused")
	private DBConnection() {
		super();
	}

	public DBConnection(String connectionUrl, String username, String password) {
		super();
		this.connectionUrl = connectionUrl;
		this.username = username;
		this.password = password;
	}

	public String getConnectionUrl() {
		return connectionUrl;
	}

	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}

	public String queryData(String query) {
		return "Your query [" + query + "] executed!";
	}

	@Override
	public void dispose() {
		connectionUrl = null;
		username = null;
		password = null;
	}
	
}
