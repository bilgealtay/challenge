package com.example.test.codewars.control;

import java.util.*;

/**
 * Created by bilga
 */
public class MatchingIntegerElements {
    public static void findMatchingElementsWithHasSet(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        // Iterate over the array
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);  // If adding fails, it's a duplicate
            }
        }

        // Print matching elements (duplicates)
        if (duplicates.isEmpty()) {
            System.out.println("No matching elements found.");
        } else {
            System.out.println("Matching elements: " + duplicates);
        }
    }

    public static void findMatchingElementsWithNestedLoop(int[] arr) {
        System.out.println("Matching elements: ");
        boolean foundMatch = false;

        // Compare each pair of elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    foundMatch = true;
                    break;
                }
            }
        }

        if (!foundMatch) {
            System.out.println("No matching elements found.");
        }
    }

    public static void findMatchingElementsWithSorting(int[] arr) {
        Arrays.sort(arr);  // Sort the array first

        System.out.println("Matching elements: ");
        boolean foundMatch = false;

        // Compare each element with the next one
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                foundMatch = true;
            }
        }

        if (!foundMatch) {
            System.out.println("No matching elements found.");
        }
    }

    public static void findMatchingElementsFrequencyCount(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Matching elements (duplicates): ");
        boolean foundMatch = false;

        // Print elements that appear more than once
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                foundMatch = true;
            }
        }

        if (!foundMatch) {
            System.out.println("No matching elements found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 1};
        findMatchingElementsWithHasSet(arr);  // Output: Matching elements: [1, 2]
    }
}
