package com.blogging.datastructures.search;

public class LinearSearch {
    public static void main(String[] args) {
        Integer resultIndex = linearSearch(new int[] {1,2,3,4,5,6,7,8,9,10}, 5);
        if(resultIndex == -1) {
            System.out.println("Number not found!");
        } else {
            System.out.println("Number found at index: " + resultIndex);
        }
    }

    private static Integer linearSearch(int[] numbers, int searchNumber) {
        int index = 0;
        for(int number : numbers) {
            if(number == searchNumber) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
