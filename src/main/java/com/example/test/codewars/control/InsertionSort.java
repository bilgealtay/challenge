package com.example.test.codewars.control;

/**
 * Created by bilga
 */
public class InsertionSort {
    // Function to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Traverse through 1 to n-1
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Element to be inserted into the sorted part
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Insert the key after the correct position
            arr[j + 1] = key;
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
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Original array:");
        printArray(arr);

        // Perform insertion sort
        insertionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

