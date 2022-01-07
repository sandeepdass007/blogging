package com.blogging.java8.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		Display display = msg -> {
			System.out.println(msg);
		};
		
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
