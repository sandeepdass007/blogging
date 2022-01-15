package com.blogging.solid;

public class LiskovDemo {

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.walk();
		lion.run();
		lion.eatFlesh();
		
		Goat goat = new Goat();
		goat.walk();
		goat.run();
		goat.eatFlesh();// wrong
	}

}
