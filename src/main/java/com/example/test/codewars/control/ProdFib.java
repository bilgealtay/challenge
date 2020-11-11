package com.example.test.codewars.control;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bilga on 22-01-2020
 */
public class ProdFib {

    public static long[] productFib(long prod) {
        List<Long> fibonacciNumber = new ArrayList<>();
        long[] expectList = new long[3];
        fibonacciNumber.add(0L);
        fibonacciNumber.add(1L);
        Long multiplication = fibonacciNumber.get(fibonacciNumber.size() - 1) * fibonacciNumber.get(fibonacciNumber.size() - 2);
        while (multiplication.longValue() < prod) {
            fibonacciNumber.add(fibonacciNumber.get(fibonacciNumber.size() - 1) + fibonacciNumber.get(fibonacciNumber.size() - 2));
            multiplication = fibonacciNumber.get(fibonacciNumber.size() - 1) * fibonacciNumber.get(fibonacciNumber.size() - 2);
        }
        expectList[0] = fibonacciNumber.get(fibonacciNumber.size() - 2);
        expectList[1] = fibonacciNumber.get(fibonacciNumber.size() - 1);
        if (prod == multiplication.longValue()) {
            expectList[2] = 1;
        } else {
            expectList[2] = 0;
        }
        return expectList;
    }
}
