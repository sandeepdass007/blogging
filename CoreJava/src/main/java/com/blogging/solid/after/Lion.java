package com.blogging.solid.after;

public class Lion extends Carnivore {

	@Override
	public void huntTarget() {
		System.out.println("Lion hunting the target!");
	}

	@Override
	public String getName() {
		return "Lion";
	}
}
