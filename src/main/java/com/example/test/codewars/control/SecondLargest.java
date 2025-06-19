package com.example.test.codewars.control;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Created by bilga
 */
public class SecondLargest {
    // Method to find the second largest number in an array
    public static int findSecondLargestWithStream(int[] arr) {
        // Handle edge cases: array must have at least two elements
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return -1;  // Return -1 or throw an exception for invalid input
        }

        // Convert the array to a Stream, sort in descending order, skip the largest, and get the second largest
        OptionalInt secondLargest = Arrays.stream(arr)
                .distinct()               // Remove duplicates to ensure we find the second unique largest element
                .sorted()                 // Sort in ascending order
                .skip(arr.length - 2)     // Skip the largest element and get the second largest
                .findFirst();             // Get the first element (which will be the second largest)

        // If a second largest number exists, return it, otherwise return -1
        return secondLargest.orElse(-1);
    }

    public static int findSecondLargest(int[] arr) {
        // Check if the array has less than two elements
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return -1;  // Return -1 or throw an exception for invalid input
        }

        int largest = Integer.MIN_VALUE;  // Start with the smallest possible integer
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array
        for (int num : arr) {
            // Update the largest and second largest accordingly
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Check if a valid second largest number exists
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
            return -1;  // Return -1 if there is no second largest
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};  // Example array
        int result = findSecondLargest(arr);

        if (result != -1) {
            System.out.println("The second largest number is: " + result);
        }
    }
}

