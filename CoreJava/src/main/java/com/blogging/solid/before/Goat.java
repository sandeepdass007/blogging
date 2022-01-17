package com.blogging.solid.before;

public class Goat extends Animal {

	@Override
	public void huntTarget() {
		throw new RuntimeException("Excuse me! I don't hunt. I only eat grass, grains etc.");
	}
}
