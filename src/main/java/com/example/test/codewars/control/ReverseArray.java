package com.example.test.codewars.control;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by bilga
 */
public class ReverseArray {
    public static void collectionReverseArray(int[] arr) {
        // Convert int[] to List<Integer>
        List<Integer> list = Arrays.stream(arr)            // Convert to IntStream
                .boxed()               // Convert each int to Integer
                .collect(Collectors.toList()); // Collect to List

        Collections.reverse(list);
        System.out.println(list); // Output: [5, 4, 3, 2, 1]
    }

    // Function to reverse the array
    public static void reverseArray(int[] arr) {
        int left = 0;         // Start pointer
        int right = arr.length - 1; // End pointer

        // Swap elements while left pointer is less than right pointer
        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        printArray(arr);

        // Reverse the array
        reverseArray(arr);

        System.out.println("Reversed array:");
        printArray(arr);
    }
}

