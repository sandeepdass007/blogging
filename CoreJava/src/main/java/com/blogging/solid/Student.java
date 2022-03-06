package com.blogging.solid;

public class Student {

	private int age;
	private String firstName;
	private String middleName;
	private String lastName;

	// making default constructor as private because a student without
	// age and name should not exist.
	private Student() {
		super();
	}

	public Student(int age, String firstName, String middleName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	// getters
	
	// setters
	
	// adding new feature keeping in mind that it follows the
	// Open/Close as well as Single Responsibility Principle
	public String getFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
}
