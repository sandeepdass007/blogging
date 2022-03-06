package com.blogging.solid;

public class OpenClosedDemo {

	public static void main(String[] args) {
		Student student = new Student(24, "James", "Duckworth", "Lewis");
		final String fullName = student.getFullName();
		System.out.println("Student full name: " + fullName);
	}

}
