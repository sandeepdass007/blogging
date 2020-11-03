package com.blogging.model;

public class Employee {

	private int age;
	private String firstName;
	private String middleName;
	private String lastName;

	private Employee() {
	}

	public Employee(int age, String firstName, String middleName, String lastName) {
		super();
		this.age = age;
		this.firstName = getFormattedName(firstName);
		this.middleName = getFormattedName(middleName);
		this.lastName = getFormattedName(lastName);
	}
	
	private String getFormattedName(String name) {
		return name == null || name.trim().length() == 0 ? "-" : name;
	}

	@Override
	public String toString() {
		return String.format("Age: %d, First Name: %s, Middle Name: %s, Last Name: %s",
				age, firstName, middleName, lastName);
	}
}
