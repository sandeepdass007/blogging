package com.blogging.solid.before;

public class UserService {

	private MySql mysql;
	
	private UserService() {}
	
	public UserService(final MySql mysql) {
		this.mysql = mysql;
	}
	
	public String getName() {
		return mysql.query("sql query");
	}
}
