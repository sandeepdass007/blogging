package com.blogging.datastructures.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] data = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		
		System.out.println("Input Data:-");
		for(int val : data) {
			System.out.println(val);
		}
		
		for(int sortedIndex = 0; sortedIndex < data.length; sortedIndex++) {
			int swapTargetIndex = sortedIndex;
			for(int position = sortedIndex; position < data.length; position++) {
				if(data[position] < data[sortedIndex]) {
					swapTargetIndex = position;
				}
			}
			int temp = data[swapTargetIndex];
			data[swapTargetIndex] = data[sortedIndex];
			data[sortedIndex] = temp;
		}
		
		System.out.println("Sorted Data:-");
		for(int val : data) {
			System.out.println(val);
		}
	}

}
