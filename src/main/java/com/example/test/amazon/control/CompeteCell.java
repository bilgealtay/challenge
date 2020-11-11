package com.example.test.amazon.control;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by bilga on 22-01-2020
 */
public class CompeteCell {

    public static List<Integer> cellCompete(int[] states, int days) {
        int statesLenght = states.length;
        int previousCells[] = new int[states.length];
        for (Integer i = 0; i < states.length ; i++ ){
            previousCells[i] = states[i];
        }
        for (Integer k = 0; k < days ; k++ ){
            for (Integer j = 1; j < previousCells.length - 1 ; j++ ){
                if ((previousCells[j-1] == 1 && previousCells[j+1] == 1) || (previousCells[j-1] == 0 && previousCells[j+1] == 0)){
                    states[j] = 0;
                } else{
                    states[j] = 1;
                }
            }
            if (previousCells[1] == 0){
                states[0] = 0;
            } else{
                states[0] = 1;
            }
            if (previousCells[statesLenght-2] == 0){
                states[statesLenght-1] = 0;
            } else{
                states[statesLenght-1] = 1;
            }
            for (Integer i = 0; i < states.length ; i++ ){
                previousCells[i] = states[i];
            }
        }
        List<Integer> currentCellStates = Arrays.stream(states).boxed().collect(Collectors.toList());

        return currentCellStates;
    }

}
