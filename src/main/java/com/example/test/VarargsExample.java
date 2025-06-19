package com.example.test;

public class VarargsExample {

    public static void printStrings(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        printStrings("Hello", "World", "This", "is", "a", "test");
    }
}
