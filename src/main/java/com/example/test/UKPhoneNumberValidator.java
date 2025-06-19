package com.example.test;

import java.util.stream.IntStream;

public class UKPhoneNumberValidator {

    public static boolean isValidUKPhoneNumber(String phoneNumber) {
        // 1. Remove non-digit characters
        String digitsOnly = phoneNumber.replaceAll("[^\\d]", "");

        // 2. Check length (UK numbers are typically 10 or 11 digits)
        if (digitsOnly.length() < 10 || digitsOnly.length() > 11) {
            return false;
        }

        // 3. Check if all characters are digits using IntStream
        try {
            digitsOnly.chars()
                    .map(Character::getNumericValue)
                    .forEach(digit -> {
                        if (digit < 0 || digit > 9) {
                            throw new IllegalArgumentException("Non-digit character found");
                        }
                    });
        } catch (IllegalArgumentException e) {
            return false; // Non-digit character found
        }

        // 4. (Optional) Add more specific UK format checks if needed
        //    For example, check for specific area codes or mobile prefixes.
        //    This would require more complex logic and is not easily done with IntStream.

        return true; // Basic validation passed
    }

    public static void main(String[] args) {
        String[] phoneNumbers = {
                "+44 7123 456789",
                "+44 20 7123 4567",
                "020 7946 0000",
                "020 7123 4567",
                "07123456789",
                "123-456-7890", // Not a UK format
                "abc-def-ghij"  // Invalid
        };

        for (String number : phoneNumbers) {
            System.out.println(number + " is valid: " + isValidUKPhoneNumber(number));
        }
    }
}