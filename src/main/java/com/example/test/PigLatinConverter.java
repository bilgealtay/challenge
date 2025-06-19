package com.example.test;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PigLatinConverter {

    public static String pigIt(String str) {
        return Pattern.compile(" +").splitAsStream(str)
                .map(s -> s.matches("[a-zA-z]+") ? s.substring(1) + s.charAt(0) + "ay" : s)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool")); // Output: igPay atinlay siay oolcay
        System.out.println(pigIt("Hello world !"));     // Output: elloHay orldway !
    }
}