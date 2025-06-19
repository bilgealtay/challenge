package com.example.test.codewars.control;

/**
 * Created by bilga
 */
public class CharCount {
    public static long countOccurrencesWithStream(String str, char target) {
        return str.chars().filter(c -> c == target).count();
    }

    public static int countOccurrencesWithLoop(String str, char target) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrencesWithLoop("hello", 'l'));  // Output: 2
        System.out.println(countOccurrencesWithLoop("java", 'a'));   // Output: 2
    }
}
