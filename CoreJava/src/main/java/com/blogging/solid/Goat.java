package com.blogging.solid;

public class Goat extends Animal {

	@Override
	public void eatFlesh() {
		throw new RuntimeException("Goat does not eat flesh!");
	}
}
