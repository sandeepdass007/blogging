package com.blogging.solid.after;

public class MySql extends DataSource {

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

	@Override
	public String query(String string) {
		// executing query and returning result
		return "Dummy Name";
	}

}
