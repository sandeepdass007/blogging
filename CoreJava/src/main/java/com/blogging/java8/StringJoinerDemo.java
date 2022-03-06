package com.blogging.java8;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(",");
		stringJoiner.add("Sandeep");
		stringJoiner.add("Ashish");
		stringJoiner.add("Geeta");
		stringJoiner.add("Jason");
		stringJoiner.add("Tina");
		System.out.println(stringJoiner);
		System.out.println();
		// String Joiner with separator as well as Prefix and Suffix
		System.out.println("String Joiner with separator as well as Prefix and Suffix");
		stringJoiner = new StringJoiner(",", "[", "]");
		stringJoiner.add("Sandeep");
		stringJoiner.add("Ashish");
		stringJoiner.add("Geeta");
		stringJoiner.add("Jason");
		stringJoiner.add("Tina");
		System.out.println(stringJoiner);
	}

}
