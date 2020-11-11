package com.example.test.codewars.control;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by bilga on 22-01-2020
 */
public class BitCounting {

    public static int countBits(int n){
        if (n > 0){
            String binaryStr = Integer.toBinaryString(n);
            Map<String, Long> binaryMap = binaryStr
                    .chars()
                    .mapToObj(i -> (char) i)
                    .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
            for (Object key : binaryMap.keySet()) {
                if ("1".equalsIgnoreCase(key.toString())){
                    return binaryMap.get(key).intValue();
                }
            }
        }
        return Integer.valueOf("0").intValue();
    }
}
