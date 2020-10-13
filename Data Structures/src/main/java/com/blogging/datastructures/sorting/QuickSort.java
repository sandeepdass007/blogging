package com.blogging.datastructures.sorting;

public class QuickSort {

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

	private static void sort(int[] data, int start, int end) {
		if(start >= end) {
			return;
		}
		int pivotIndex = partition(data, start, end);
		sort(data, start, pivotIndex - 1);
		sort(data, pivotIndex + 1, end);
	}

	private static int partition(int[] data, int start, int end) {
		int pivot = data[end];
		int sortedPartIndex = start;
		for(int iterativeIndex = start; iterativeIndex < end; iterativeIndex++) {
			if(data[iterativeIndex] < pivot) {
				if(sortedPartIndex != iterativeIndex) {
					swap(data, sortedPartIndex, iterativeIndex);
				}
				sortedPartIndex++;
			}
		}
		swap(data, sortedPartIndex, end);
		return sortedPartIndex;
	}
	
	private static void swap(int[] data, int index1, int index2) {
		int temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}

}
