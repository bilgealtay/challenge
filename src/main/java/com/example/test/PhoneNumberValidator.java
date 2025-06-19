package com.example.test;

import java.util.regex.Pattern;

public class PhoneNumberValidator {

    private static final Pattern UK_PHONE_PATTERN = Pattern.compile("^\\+44\\d{10}$");

    public static boolean isValidUKPhoneNumber(String phoneNumber) {
        if (phoneNumber == null) {
            return false;
        }
        return UK_PHONE_PATTERN.matcher(phoneNumber).matches();
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