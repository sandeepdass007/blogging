package com.blogging.solid.after;

public abstract class Animal {

	public void run() {
		System.out.println("Running...");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	
	public abstract String getName();
}
