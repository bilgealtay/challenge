package com.example.test.codewars.control;

/**
 * Created by bilga on 22-01-2020
 */
public class PangramChecker {

    public boolean check(String sentence){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String[] sentenceStrArray = sentence.split("");

        for(String item : sentenceStrArray) {
            String itemToLow = item.toLowerCase();
            letters = letters.replace(itemToLow, "");
        }

        if (letters.length() > 0){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
