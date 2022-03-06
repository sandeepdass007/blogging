package com.blogging.solid.before;

public class LiskovDemo {

	public static void main(String[] args) {
		Lion lion = new Lion();
		performAnimalActions(lion);
		Goat goat = new Goat();
		performAnimalActions(goat);
	}
	
	private static void performAnimalActions(Animal animal) {
		animal.walk();
		animal.run();
		animal.sleep();
		animal.huntTarget();
	}
}
