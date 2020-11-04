package com.blogging.java8.streams;

import java.util.stream.Stream;

public class SkipAndLimit {

	public static void main(String[] args) {
		System.out.println("Demonstrating Limit in Streams API...");
		demonstrateLimit();
		System.out.println();
		System.out.println("Demonstrating Skip in Streams API");
		demonstrateSkip();
	}
	
	private static void demonstrateLimit() {
		Stream.of(0,1,2,3,4,5,6,7,8,9,10)
		.limit(5) // consider first "5" elements from the stream
		.forEach(System.out::println);
	}
	
	private static void demonstrateSkip() {
		Stream.of(0,1,2,3,4,5,6,7,8,9,10)
		.skip(5) // skip first "5" elements from the stream
		.forEach(System.out::println);
	}

}
