package com.example.test.codility;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by bilga on 08-11-2020
 */
@Component
public class CodilityControl {

    public int getBinaryGap(int N){
        String toBinary = Integer.toBinaryString(N);
        String s2[] = toBinary.substring(0, toBinary.lastIndexOf('1')).split("1");

        int x = 0;
        int a = 0;
        while(x < s2.length){
            a = a > s2[x].length() ? a : s2[x].length();
            x++;
        }
        return a;
    }

    public List<Integer> reverseArray(List<Integer> intArray){
        List<Integer> reverseList = new ArrayList<>();
        for (int i = intArray.size()-1; i >= 0; i--) {
            reverseList.add(intArray.get(i));
        }
        return reverseList;
    }

    public int[] cyclicRotation(int[] A, int K){
        if (A.length == 0 || A.length == 1){
            return A;
        }
        for (int i = 0; i < K; i++) {
            int last = A[A.length-1];
            for (int j = A.length-1; j > 0 ; j--) {
                A[j] = A[j-1];
            }
            A[0] = last;
        }
        return A;
    }

    public int oddOccurrencesInArray(int[] A){
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (i != j && A[i] == A[j])
                    count++;
            }
            if (count == 0){
                return A[i];
            }
        }
        return 0;
    }

    public int getCountOfFrogJump(int X, int Y, int D){
        int difference = Y - X;
        if (difference == 0){
            return 0;
        } else if  (difference % D == 0){
            return difference / D;
        } else {
            return (difference / D) + 1;
        }
    }

    public int getPermMissingElem(int[] A){
        if (A.length == 0){
            return 1;
        }
        int sizeElements = A.length + 1;
        int summaryOfElements = IntStream.of(A).sum();
        int summaryOfSizeElement = (sizeElements * (sizeElements + 1)) / 2;
        return summaryOfSizeElement - summaryOfElements;
    }

    public int getTapeEquilibrium(int[] A){
        int N = A.length;

        int sum1 = A[0];
        int sum2 = 0;
        int P = 1;
        for (int i = P; i < N; i++) {
            sum2 += A[i];
        }
        int diff = Math.abs(sum1 - sum2);

        for (; P < N-1; P++) {
            sum1 += A[P];
            sum2 -= A[P];

            int newDiff = Math.abs(sum1 - sum2);
            if (newDiff < diff) {
                diff = newDiff;
            }
        }
        return diff;
    }

}
