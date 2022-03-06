package com.blogging.datastructures.sorting;

public class InsertionSort {

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
		for(int sortedIndex = 1; sortedIndex < data.length ; sortedIndex++) {
			for(int position = sortedIndex; position > 0; position--) {
				if(data[position] < data[position - 1]) { // swap
					int temp = data[position - 1];
					data[position - 1] = data[position];
					data[position] = temp;
				}
			}
		}
	}

}
