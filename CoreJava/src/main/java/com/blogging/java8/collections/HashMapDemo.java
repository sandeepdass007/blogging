package com.blogging.java8.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>() {
			private static final long serialVersionUID = 4902975482342302372L;
			{
				put("Sandeep", 26);
				put("Ashish", 30);
			}
		};
		
		map.computeIfPresent("Sandeep", (key, value) -> value + 10);
		map.computeIfAbsent("Shiva", y -> 24);
		map.values().forEach(System.out::println);
	}

}
