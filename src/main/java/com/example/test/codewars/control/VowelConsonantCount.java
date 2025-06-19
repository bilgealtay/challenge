package com.example.test.codewars.control;

/**
 * Created by bilga
 */
public class VowelConsonantCount {
    public static void countVowelsAndConsonantsWithSimpleLoop(String str) {
        int vowels = 0;
        int consonants = 0;

        // Convert the string to lowercase to handle case-insensitivity
        str = str.toLowerCase();

        // Iterate through the string
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {  // Ignore non-alphabet characters
                if ("aeiou".indexOf(c) != -1) {  // Check if the character is a vowel
                    vowels++;
                } else {  // If it's not a vowel, it's a consonant
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void countVowelsAndConsonantsWithRegularExpression(String str) {
        // Convert string to lowercase
        str = str.toLowerCase();

        // Regular expressions for vowels and consonants
        int vowels = str.replaceAll("[^aeiou]", "").length();  // Match all vowels
        int consonants = str.replaceAll("[^a-z]", "").replaceAll("[aeiou]", "").length();  // Match consonants

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void countVowelsAndConsonantsWithStream(String str) {
        long vowels = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiou".indexOf(Character.toLowerCase(c)) != -1)
                .count();  // Count vowels

        long consonants = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> Character.isLetter(c) && "aeiou".indexOf(Character.toLowerCase(c)) == -1)
                .count();  // Count consonants

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        countVowelsAndConsonantsWithSimpleLoop("Hello World!");  // Vowels: 3, Consonants: 7
    }
}
