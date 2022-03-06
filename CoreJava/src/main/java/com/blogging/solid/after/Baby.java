package com.blogging.solid.after;

public class Baby implements Child  {

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

	@Override
	public void play() {
		System.out.println("Playing...");
	}
}
