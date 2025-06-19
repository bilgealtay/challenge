package com.example.test.coderByte;

import java.math.BigInteger;

/**
 * Created by bilga
 */
public class BracketCombinations {

    public static int bracketCombinations(int num) {
        return binomialCoefficient(2 * num, num).divide(BigInteger.valueOf(num + 1)).intValue();
    }

    private static BigInteger binomialCoefficient(int n, int k) {
        BigInteger result = BigInteger.ONE;

        for (int i = 0; i < k; i++) {
            result = result.multiply(BigInteger.valueOf(n - i));
            result = result.divide(BigInteger.valueOf(i + 1));
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(bracketCombinations(3)); // Output: 5
        System.out.println(bracketCombinations(2)); // Output: 2
        System.out.println(bracketCombinations(0)); // Output: 1
    }
}
