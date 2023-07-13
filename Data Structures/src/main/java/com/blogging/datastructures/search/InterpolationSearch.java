package com.blogging.datastructures.search;

public class InterpolationSearch {
    public static int interpolationSearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right && target >= array[left] && target <= array[right]) {
            if (left == right) {
                if (array[left] == target) {
                    return left;
                }
                return -1;
            }

            int pos = left + ((target - array[left]) * (right - left)) / (array[right] - array[left]);

            if (array[pos] == target) {
                return pos;
            }

            if (array[pos] < target) {
                left = pos + 1;
            } else {
                right = pos - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int target = 12;
        int index = interpolationSearch(array, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}

