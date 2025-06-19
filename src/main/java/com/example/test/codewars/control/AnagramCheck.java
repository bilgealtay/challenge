package com.example.test.codewars.control;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by bilga
 */
public class AnagramCheck {
    public static boolean areAnagramsWithSorting(String str1, String str2) {
        // If lengths are not the same, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays, sort, and compare
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static boolean areAnagramsWithHashMap(String str1, String str2) {
        // If lengths are not the same, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Use a HashMap to count character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
            if (charCountMap.get(c) < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagramsWithSorting("listen", "silent"));  // true
        System.out.println(areAnagramsWithSorting("hello", "world"));    // false
    }
}
