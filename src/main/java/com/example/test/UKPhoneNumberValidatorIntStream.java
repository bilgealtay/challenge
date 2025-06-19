package com.example.test;

import java.util.stream.IntStream;

public class UKPhoneNumberValidatorIntStream {

    public static boolean isValidUKPhoneNumber(String phoneNumber) {
        // 1. Remove non-digit characters
        String digitsOnly = phoneNumber.replaceAll("[^\\d]", "");

        // 2. Check length (UK numbers are typically 10 or 11 digits)
        if (digitsOnly.length() < 10 || digitsOnly.length() > 11) {
            return false;
        }

        // 3. Use IntStream to check if all characters are digits
        return IntStream.range(0, digitsOnly.length())
                .allMatch(i -> Character.isDigit(digitsOnly.charAt(i)));

        // Note: This still doesn't validate the specific UK format,
        // only checks for digits and length.
    }

    public static void main(String[] args) {
        String[] phoneNumbers = {
                "+44 7123 456789",
                "020 7946 0000",
                "07123456789",
                "07751003179",
                "+44 7751003179",
                "123-456-7890", // Not a UK format
                "abc-def-ghij"  // Invalid
        };

        for (String number : phoneNumbers) {
            System.out.println(number + " is valid: " + isValidUKPhoneNumber(number));
        }
    }
}