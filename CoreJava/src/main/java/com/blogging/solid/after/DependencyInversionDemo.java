package com.blogging.solid.after;

public class DependencyInversionDemo {

	public static void main(String[] args) {
		DataSource dataSource = new MySql();
		UserService userService = new UserService(dataSource);
		final String name = userService.getName();
		System.out.println(name);
	}

}
