package com.blogging.solid.before;

public class MySql {

	private String hostName;
	private Integer port;
	private String username;
	private String password;

	public MySql() {
		super();
	}

	public MySql(String hostName, Integer port, String username, String password) {
		super();
		this.hostName = hostName;
		this.port = port;
		this.username = username;
		this.password = password;
	}

	public String query(String string) {
		// executing query and returning result
		return "Dummy Name";
	}

}
