package com.blogging.java8;

import com.blogging.java8.functional.Processor;

/**
 * Demonstrating method referencing in Java8
 * @author Sandeep
 *
 */
public class MethodReferenceDemo {

	public static void main(String[] args) {
		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
		methodReferenceDemo.executeWarningDemo();
		methodReferenceDemo.executeErrorDemo();
	}

	/**
	 * Demonstrating method referencing to {@link MethodReferenceDemo#displayWarning(String) displayWarning}
	 */
	private void executeWarningDemo() {
		int value1 = 10;
		int value2 = 20;
		Processor processor = this::display;
		// ignore the logic. It is explicitly added to be "true"
		if(value1 < value2) {
			// :: is used to reference the method
			// before :: is the object (or class in case of static method) whose method is being referred
			// after :: is the method to be referenced
			processor = this::displayWarning;
		}
		processor.process("My message demonstrating warning method referencing.");
	}
	
	/**
	 * Demonstrating method referencing to {@link MethodReferenceDemo#displayError(String) displayError}
	 */
	private void executeErrorDemo() {
		int value1 = 0;
		int value2 = 20;
		Processor processor = this::display;
		if(value1 == 0 || value2 == 0) {
			processor = this::displayError;
		}
		processor.process("My message demonstrating error method referencing.");
	}
	
	/**
	 * Hypothetical representation of error message printing
	 * @param message
	 */
	public void displayError(String message) {
		System.out.println("[Error]: " + message);
	}
	
	/**
	 * Hypothetical representation of warning message printing
	 * @param message
	 */
	public void displayWarning(String message) {
		System.out.println("[Warning]: " + message);
	}
	
	/**
	 * Hypothetical representation of default message printing
	 * @param message
	 */
	public void display(String message) {
		System.out.println(message);
	}

}
