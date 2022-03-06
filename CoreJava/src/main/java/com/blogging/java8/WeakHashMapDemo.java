package com.blogging.java8;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		System.out.println("Demonstrating general HashMap...");
		hashMapDemo();
		System.out.println();
		System.out.println("Demonstrating WeakHashMap...");
		weakHashMapDemo();
	}
	
	private static void hashMapDemo() {
		HashMap<Long, String> weakHashMap = new HashMap<Long, String>();
		Long number1 = new Long(12345);
		weakHashMap.put(number1, "Random Text");
		System.out.println("HashMap before key setting null and running Garbage Collector");
		System.out.println(weakHashMap);
		number1 = null;
		System.gc();
		System.out.println("HashMap after key setting null and running Garbage Collector");
		System.out.println(weakHashMap);
	}
	
	private static void weakHashMapDemo() {
		WeakHashMap<Long, String> weakHashMap = new WeakHashMap<Long, String>();
		Long number1 = new Long(12345);
		weakHashMap.put(number1, "Random Text");
		System.out.println("WeakHashMap before key setting null and running Garbage Collector");
		System.out.println(weakHashMap);
		number1 = null;
		System.gc();
		System.out.println("WeakHashMap after key setting null and running Garbage Collector");
		System.out.println(weakHashMap);
	}

}
