package com.blogging.solid.after;

public class Goat extends Herbivore {

	@Override
	public void eatGrass() {
		System.out.println("Eating grass...");
	}

	@Override
	public String getName() {
		return "Goat";
	}

}
