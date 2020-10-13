package com.blogging.datastructures.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] data = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		System.out.println("Input Data:-");
		for(int val : data) {
			System.out.println(val);
		}
		sort(data, 0, data.length - 1);
		System.out.println("Sorted Data:-");
		for(int val : data) {
			System.out.println(val);
		}
	}

	private static void sort(int[] data, int startIndex, int endIndex) {
		if(startIndex >= endIndex) {
			return;
		}
		int midIndex = (startIndex + endIndex) / 2;
		sort(data, startIndex, midIndex);
		sort(data, midIndex + 1, endIndex);
		merge(data, startIndex, midIndex, endIndex);
	}
	
	private static void merge(int[] data, int startIndex, int midIndex, int endIndex) {
		int[] sortedArray = new int[endIndex - startIndex + 1];
		int offset1 = startIndex, offset2 = midIndex + 1;
		int sortedArrOffset = 0;
		while(offset1 <= midIndex && offset2 <= endIndex) {
			if(data[offset1] <= data[offset2]) {
				sortedArray[sortedArrOffset] = data[offset1];
				offset1++;
			} else {
				sortedArray[sortedArrOffset] = data[offset2];
				offset2++;
			}
			sortedArrOffset++;
		}
		
		while(offset1 <= midIndex) {
			sortedArray[sortedArrOffset] = data[offset1];
			sortedArrOffset++;
			offset1++;
		}
		while(offset2 <= endIndex) {
			sortedArray[sortedArrOffset] = data[offset2];
			sortedArrOffset++;
			offset2++;
		}
		for(int offset = 0; offset < sortedArray.length; offset++) {
			data[startIndex++] = sortedArray[offset];
		}
	}

}
