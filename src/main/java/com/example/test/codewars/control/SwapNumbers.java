package com.example.test.codewars.control;

/**
 * Created by bilga
 */
public class SwapNumbers {
    public static void swapNumbersWithArithmeticOperations(int a, int b) {
        // Swap without using a third variable
        a = a + b; // Step 1: a becomes 15 (a + b)
        b = a - b; // Step 2: b becomes 5 (15 - 10)
        a = a - b; // Step 3: a becomes 10 (15 - 5)

        System.out.println("a = " + a); // Output: a = 10
        System.out.println("b = " + b); // Output: b = 5
    }

    public static void swapNumbersWithXOROperation(int a, int b) {
        // Swap using XOR bitwise operation
        a = a ^ b; // Step 1: a becomes 15 (5 ^ 10)
        b = a ^ b; // Step 2: b becomes 5 (15 ^ 10)
        a = a ^ b; // Step 3: a becomes 10 (15 ^ 5)

        System.out.println("a = " + a); // Output: a = 10
        System.out.println("b = " + b); // Output: b = 5
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swapNumbersWithArithmeticOperations(a, b);
    }
}
