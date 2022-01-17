package com.blogging.solid.before;

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
	
	public abstract void huntTarget();
}
