package com.example.test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BirthdayDayOfWeek {

    public static String formatPhoneNumber(int[] digits) {
        if (digits == null || digits.length != 10) {
            throw new IllegalArgumentException("Phone number must have 10 digits.");
        }

        return IntStream.of(digits)
                .mapToObj(String::valueOf)
                .collect(Collectors.collectingAndThen(
                        Collectors.joining(),
                        s -> String.format("(%s) %s-%s",
                                s.substring(0, 3),
                                s.substring(3, 6),
                                s.substring(6, 10))
                ));
    }

    public static void main(String[] args) {
        int[] phoneNumberDigits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String formattedNumber = formatPhoneNumber(phoneNumberDigits);
        System.out.println(formattedNumber); // Output: (123) 456-7890
    }
}