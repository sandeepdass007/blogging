package com.blogging.java8.arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		final int[] array = new int[] { 90, 80, 70, 60, 50, 40, 30, 20, 10 };
		// parallel sorting which takes O(nlog(n)) time complexity
		Arrays.parallelSort(array);
		// convert sorted array into streams
		Arrays.stream(array).forEach(System.out::println);
	}

}
