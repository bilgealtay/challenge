package com.example.test.codewars.control;

/**
 * Created by bilga
 */
public class BinarySearch {
    // Method to implement binary search
    public static int binarySearch(int[] arr, int target) {
        int low = 0;                // Start of the array
        int high = arr.length - 1;  // End of the array

        while (low <= high) {
            int mid = low + (high - low) / 2;  // Find the middle index

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;  // Target found, return the index
            }

            // If target is smaller, ignore the right half
            if (arr[mid] > target) {
                high = mid - 1;
            }
            // If target is larger, ignore the left half
            else {
                low = mid + 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};  // A sorted array

        int target = 10;
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

