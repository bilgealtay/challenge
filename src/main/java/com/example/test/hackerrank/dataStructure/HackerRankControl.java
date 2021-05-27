package com.example.test.hackerrank.dataStructure;


import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Created by bilga on 13-11-2020
 */@Component
public class HackerRankControl {

     public void fizzBuzz(int n){
         IntStream.rangeClosed(1, n)
                 .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                 .forEach(System.out::println);
     }

     public int[] sparseArrays(String[] strings, String[] queries){
         if ((strings.length < 1 || strings.length > 1000) && (queries.length < 1 || queries.length > 1000)){
            return new int[0];
         }
         // convert array to a list
         List<String> stringsList = Arrays.asList(strings);

         Map<String, Long> result =
                 stringsList.stream().collect(
                         Collectors.groupingBy(
                                 Function.identity(), Collectors.counting()
                         )
                 );

         int[] countArray = new int[queries.length];
         for (int i = 0; i < queries.length; i++) {
             if (!queries[i].isEmpty() && queries[i].length() < 20 && result.containsKey(queries[i])){
                 countArray[i] = result.get(queries[i]).intValue();
             } else {
                 countArray[i] = 0;
             }
         }

         return countArray;

    }

    public int skyscrapers(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            if (!stack.isEmpty() && stack.peek() < cur) {
                int tmp = stack.pop();
                int dupCount = 1;
                while (!stack.isEmpty() && stack.peek() < cur) {
                    int top = stack.pop();
                    if (top == tmp) {
                        dupCount++;
                    } else {
                        //update possible routes
                        res += dupCount * (dupCount - 1);
                        tmp = top;
                        dupCount = 1;
                    }
                }
                res += dupCount * (dupCount - 1);
            }
            stack.push(cur);
        }
        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            long dupCount = 1;
            while (!stack.isEmpty() && stack.peek() == tmp) {
                dupCount++;
                stack.pop();
            }
            res += dupCount * (dupCount - 1);
        }
        return res;
    }

    public int findMaximumIndexProduct(int[] arr){
        int[] lefts = buildClosest(arr, IntStream.range(0, arr.length).toArray());
        int[] rights = buildClosest(arr, IntStream.range(0, arr.length).map(i -> arr.length - 1 - i).toArray());

        int maxProduct = 0;
        for (int i = 0; i < lefts.length; i++) {
            maxProduct = Math.max(maxProduct, lefts[i] * rights[i]);
        }
        return maxProduct;
    }

    private int[] buildClosest(int[] a, int[] indices) {
        int[] closest = new int[a.length];
        Stack<Integer> indexStack = new Stack<>();
        for (int index : indices) {
            while (!indexStack.empty() && a[index] >= a[indexStack.peek()]) {
                indexStack.pop();
            }

            closest[index] = indexStack.empty() ? 0 : (indexStack.peek() + 1);

            indexStack.push(index);
        }
        return closest;
    }

}
