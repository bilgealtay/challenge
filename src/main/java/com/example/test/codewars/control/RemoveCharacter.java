package com.example.test.codewars.control;

/**
 * Created by bilga
 */
public class RemoveCharacter {
    // Method to remove all instances of a character from a string
    public static String removeCharacter(String str, char ch) {
        // Use the replace() method to replace the character with an empty string
        return str.replace(String.valueOf(ch), "");
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        char ch = 'o';

        String result = removeCharacter(str, ch);
        System.out.println("Original String: " + str);
        System.out.println("String after removing '" + ch + "': " + result);
    }
}

