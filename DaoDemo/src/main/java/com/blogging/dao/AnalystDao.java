package com.blogging.dao;

public class AnalystDao {

	private String name;
	private String userId;
	private int age;
	private boolean superUser;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSuperUser() {
		return superUser;
	}

	public void setSuperUser(boolean superUser) {
		this.superUser = superUser;
	}

	public AnalystDao(String name, String userId, int age, boolean superUser) {
		super();
		this.name = name;
		this.userId = userId;
		this.age = age;
		this.superUser = superUser;
	}
}
