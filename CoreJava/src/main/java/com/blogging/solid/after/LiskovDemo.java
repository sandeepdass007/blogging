package com.blogging.solid.after;

public class LiskovDemo {

	public static void main(String[] args) {
		Lion lion = new Lion();
		performAnimalActions(lion);
		Goat goat = new Goat();
		performAnimalActions(goat);
	}
	
	private static void performAnimalActions(Animal animal) {
		final String animalName = animal.getName();
		System.out.println("Processing actions for " + animalName);
		animal.walk();
		animal.run();
		animal.sleep();
	}
}
