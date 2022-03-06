package com.blogging.solid.after;

public class UserService {

	private DataSource dataSource;
	
	private UserService() {}
	
	public UserService(final DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public String getName() {
		return dataSource.query("sql query");
	}
}
