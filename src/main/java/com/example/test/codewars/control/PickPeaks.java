package com.example.test.codewars.control;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by bilga on 22-01-2020
 */
public class PickPeaks {

    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        List<Integer> posList = new ArrayList<>();
        List<Integer> peakList = new ArrayList<>();
        Map<String, List<Integer>> posPeakMap = new HashMap<>();

        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                posList.add(i);
                peakList.add(arr[i]);
            } else if(arr[i-1] < arr[i] && arr[i] == arr[i+1]){
                // control rest of items to find plateau
                boolean isPlateau = false;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] == arr[i+1]){
                        continue;
                    } else if (arr[j] < arr[i+1]){
                        isPlateau = true;
                        break;
                    } else if (arr[j] > arr[i+1]){
                        isPlateau = false;
                        break;
                    }
                }
                if (isPlateau){
                    posList.add(i);
                    peakList.add(arr[i]);
                }
            }
        }
        posPeakMap.put("pos", posList);
        posPeakMap.put("peaks", peakList);
        return posPeakMap;
    }
}
