package com.blogging.solid;

import java.util.List;

public class Employee {

	private int age;
	private String firstName;
	private String middleName;
	private String lastName;

	private Employee() {
		super();
	}

	public Employee(int age, String firstName, String middleName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Age: %d, First Name: %s, Middle Name: %s, Last Name: %s", age, firstName, middleName,
				lastName);
	}

	// function violating single responsibility
	public List<Float> getSalaryStatement() {
		/*
		 * logic to fetch salary of an employee is account related responsibility which
		 * should exist in a separate class
		 */
		return null;
	}
}
