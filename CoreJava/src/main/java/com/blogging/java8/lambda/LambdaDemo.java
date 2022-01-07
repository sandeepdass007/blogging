package com.blogging.java8.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		// creating a definition of abstract function show(String).
		// Note: this is definition creation not execution.
		Display display = msg -> {
			System.out.println(msg);
		};
		
		// pass the definition which we created above with the data to be processed
		// with this definition
		displayMessage(display, "Hello World!");
		
		// or we can write it inline
		displayMessage(msg -> {
			System.out.println(msg);
		}, "Hello World!");
	}
	
	/*
	 * display is the receiver of function definition and message
	 * will be consumed by this definition
	 * */
	private static void displayMessage(final Display display, final String message) {
		display.show(message);
	}
}
