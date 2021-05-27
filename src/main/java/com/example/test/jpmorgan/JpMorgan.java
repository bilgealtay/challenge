package com.example.test.jpmorgan;

import com.example.test.hackerrank.dataStructure.SwapNodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bilga on 05-12-2020
 */
public class JpMorgan {

    static int countRotations(int arr[], int n) {
        // find index of minimum element
        int min = arr[0], min_index = -1;
        for (int i = 0; i < n; i++){
            if (min > arr[i]){
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

    // Returns index of key in arr[l..arrayLength]
    // if key is present, otherwise returns -1
    static int search(int arr[], int l, int arrayLength, int key) {
        if (l > arrayLength){
            return -1;
        }

        int mid = (l + arrayLength) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (arr[l] <= arr[mid]) {
            if (key >= arr[l] && key <= arr[mid]){
                return search(arr, l, mid - 1, key);
            }
            return search(arr, mid + 1, arrayLength, key);
        }

        if (key >= arr[mid] && key <= arr[arrayLength])
            return search(arr, mid + 1, arrayLength, key);

        return search(arr, l, mid - 1, key);
    }

    // main function


}
