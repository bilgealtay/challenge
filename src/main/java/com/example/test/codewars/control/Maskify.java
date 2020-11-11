package com.example.test.codewars.control;

/**
 * Created by bilga on 22-01-2020
 */
public class Maskify {

    public static String maskify(String str) {
        if (str != null){
            if (str.isEmpty()){
                return "";
            } else if (str.length() <= 4){
                return str;
            }
            String newStr = "";
            for (int i = 0; i < str.length()-4; i++) {
                newStr = newStr + "#";
            }
            newStr = newStr + str.substring(str.length()-4);
            return newStr;
        }
        throw new UnsupportedOperationException("Unimplemented");
    }
}
