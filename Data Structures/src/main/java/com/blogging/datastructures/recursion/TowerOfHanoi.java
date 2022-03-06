package com.blogging.datastructures.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		move(3, "A", "C", "B");
	}
	
	private static void move(int numberOfDiscs, String from, String to, String using) {
		if(numberOfDiscs == 0) {
			return;
		}
		move(numberOfDiscs-1, from, using, to);
		System.out.println(String.format("Moving disc %d from %s to %s", numberOfDiscs, from, to));
		move(numberOfDiscs-1, using, to, from);
	}

}
