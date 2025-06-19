package com.example.test.jpmorgan;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PhoneNumberFormatter {

    public static String formatPhoneNumber(int[] digits) {
        if (digits.length != 10) {
            throw new IllegalArgumentException("Input array must contain exactly 10 digits.");
        }

        // Boxed function to convert digits to strings
        Function<Integer, String> digitToString = String::valueOf;

        String formattedNumber = Arrays.stream(digits)
                .boxed() // Convert int stream to Integer stream
                .map(digitToString) // Apply the boxed function
                .collect(Collectors.joining(""));

        return String.format("(%s) %s-%s",
                formattedNumber.substring(0, 3),
                formattedNumber.substring(3, 6),
                formattedNumber.substring(6));
    }

    public static void main(String[] args) {
        int[] phoneDigits = {1, 2, 3, 4, 0, 6, 7, 8, 9, 0};
        String phoneNumber = formatPhoneNumber(phoneDigits);
        System.out.println(phoneNumber); // Output: (123) 456-7890
    }
}