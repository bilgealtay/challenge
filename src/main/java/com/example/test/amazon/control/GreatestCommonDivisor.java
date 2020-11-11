package com.example.test.amazon.control;

/**
 * Created by bilga on 22-01-2020
 */
public class GreatestCommonDivisor {

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr)
    {
        int result = arr[0];
        for (int i = 1; i < num; i++) {
            result = gcd(arr[i], result);

            if (result == 1) {
                return 1;
            }
        }

        return result;
    }
    // METHOD SIGNATURE ENDS

    // to find the greatest common divisor of two numbers
    private int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
