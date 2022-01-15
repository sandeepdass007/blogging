package com.blogging.solid.before;

public class Baby implements Human  {

	@Override
	public void eat() {
		System.out.println("Eating...");
	}

	@Override
	public void drink() {
		System.out.println("Drinking...");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping...");
	}

	@Override
	public void walk() {
		System.out.println("Walking...");
	}

	@Override
	public void run() {
		System.out.println("Running...");
	}

	// this following method is not valid for child but still had to be implemented
	@Override
	public void driveCar() {
		throw new RuntimeException("Child cannot drive!");
	}

}
