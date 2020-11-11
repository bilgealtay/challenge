package com.example.test.codewars.control;

/**
 * Created by bilga on 22-01-2020
 */
public class CreatePhoneNumber {

    public static String getPhoneNumber(int[] numbers) {
        StringBuffer sb = new StringBuffer();
        sb = sb.append("(").append(numbers[0]).append(numbers[1]).append(numbers[2]);
        sb = sb.append(") ").append(numbers[3]).append(numbers[4]).append(numbers[5]);
        sb= sb.append("-").append(numbers[6]).append(numbers[7]).append(numbers[8]).append(numbers[9]);
        return sb.toString();

    }
}
