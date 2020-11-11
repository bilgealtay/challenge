package com.example.test.codewars.control;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bilga on 22-01-2020
 */
public class StockList {

    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length < 1 || lstOf1stLetter.length < 1){
            return "";
        }
        StringBuilder summary = new StringBuilder();
        Map<String, Integer> stockListMap = new HashMap<>();
        for (String item : lstOfArt) {
            String[] itemSplit = item.split(" ");
            stockListMap.put(item.substring(0, 1), stockListMap.getOrDefault(item.substring(0, 1), 0) + Integer.valueOf(itemSplit[1]));
        }

        for (String item : lstOf1stLetter) {
            summary.append("(").append(item).append(" : ").append(stockListMap.get(item) == null ? "0" : stockListMap.get(item)).append(") - ");
        }

        return summary.substring(0, summary.length()-3);
    }

}
