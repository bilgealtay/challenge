package com.example.test.codewars.control;

import java.util.List;

/**
 * Created by bilga on 22-01-2020
 */
public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int count = 0;
        if (arr != null && !arr.isEmpty()){
            for (String item : arr) {
                if (item.length() == 2 && ((item.startsWith(":") || item.startsWith(";")) && (item.endsWith(")") || item.endsWith("D")))){
                    count = ++count;
                }
                if (item.length() == 3){
                    char[] chars = item.toCharArray();
                    if ((chars[0] == ':' || chars[0] == ';') && (chars[1] == '-' || chars[1] == '~')
                            && (chars[2] == ')' || chars[2] == 'D')){
                        count = ++count;
                    }
                }
            }
        }
        return count;
    }
}
