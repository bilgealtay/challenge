package com.example.test.hackerrank.dataStructure;

/**
 * Created by bilga on 14-11-2020
 */
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

public class FindMaximumIndexProduct {


    static int[] buildClosest(int[] a, int[] indices) {
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
