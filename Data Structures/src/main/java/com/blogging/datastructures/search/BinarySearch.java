package com.blogging.datastructures.search;

public class BinarySearch {

    public static void main(String[] args) {
        Integer resultIndex = binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10}, 101);
        if(resultIndex == -1) {
            System.out.println("Number not found!");
        } else {
            System.out.println("Number found at index: " + resultIndex);
        }
    }

    private static Integer binarySearch(int[] numbers, int searchNumber) {
        if(numbers == null || numbers.length == 0) {
            return -1;
        }
        if(numbers.length == 1 && numbers[0] == searchNumber) {
            return 0;
        }
        return binarySearch(numbers, searchNumber, 0, numbers.length - 1);
    }

    private static Integer binarySearch(int[] numbers, int searchNumber, int startIndex, int endIndex) {
        if(startIndex >= endIndex || endIndex <= startIndex) {
            return -1;
        }
        int midIndex = (startIndex + endIndex)/2;
        if(searchNumber == numbers[midIndex]) {
            return midIndex;
        }
        if(searchNumber < numbers[midIndex]) {
            return binarySearch(numbers, searchNumber, startIndex, midIndex - 1);
        }
        return binarySearch(numbers, searchNumber, midIndex+1, endIndex);
    }
}
