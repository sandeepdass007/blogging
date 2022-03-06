package com.blogging.datastructures.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] data = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		System.out.println("Input Data:-");
		for(int val : data) {
			System.out.println(val);
		}
		sort(data);
		System.out.println("Sorted Data:-");
		for(int val : data) {
			System.out.println(val);
		}
	}
	
	private static void sort(int[] data) {
		for(int boundaryIndex = 0; boundaryIndex < data.length - 1; boundaryIndex++) {
			for(int comparisonIndex = 0; comparisonIndex < data.length - 1 - boundaryIndex; comparisonIndex++) {
				if(data[comparisonIndex] > data[comparisonIndex + 1]) {
					int temp = data[comparisonIndex];
					data[comparisonIndex] = data[comparisonIndex + 1];
					data[comparisonIndex + 1] = temp;
				}
			}
		}
	}
}
