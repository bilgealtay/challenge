package com.example.test.hackerrank.java;

import org.springframework.stereotype.Component;

import java.text.NumberFormat;
import java.util.*;

/**
 * Created by bilga on 14-11-2020
 */
@Component
public class HackerRankJavaControl {

    //Regex for acceptable IP addresses
    public static  final String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
    public static  final String IP_REGEXP = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

    public void currencyFormatter(double payment){

        Locale INDIA = new Locale("en", "IN");
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

    public boolean ipRegex(String ip){
        Integer.parseInt("12");
        if(!ip.matches(new MyRegex().pattern)){
            return false;
        }
        return true;
    }

    class MyRegex {
        //Regex for acceptable IP addresses
        public static  final String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
        public static  final String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

    }

    public int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
        // Write your code here
        Map<String, List<Float>> productMap = new HashMap<>();
        for (int i = 0; i < products.size(); i++) {
            productMap.computeIfAbsent(products.get(i), ignored -> new ArrayList<>()).add(productPrices.get(i));
        }
        for (int i = 0; i < productSold.size(); i++) {
            productMap.computeIfAbsent(productSold.get(i), ignored -> new ArrayList<>()).add(soldPrice.get(i));
        }
        int wrongCount = 0;
        for (Map.Entry<String, List<Float>> entry : productMap.entrySet()) {
            List<Float> floatList = entry.getValue();
            if (floatList.size() == 2 && floatList.get(0).compareTo(floatList.get(1)) != 0){
                wrongCount++;
            }
        }
        return wrongCount;

    }

    public static int findSmallestDivisor(String s, String t) {
        // Write your code here
        String doubleT = t.concat(t);

        final int mid = t.length() / 2;
        String[] parts = {
                t.substring(0, mid),
                t.substring(mid),
        };

        if (s.equals(t)){
            if (parts[0].equals(parts[1])){
                return parts[0].length();
            } else {
                return t.length();
            }
        } else {
            if (!s.equals(doubleT)){
                return -1;
            }
        }

        if(parts[0].equals(parts[1])){
            return parts[0].length();
        } else if (!parts[0].equals(parts[1])){
            return t.length();
        }
        return -1;
    }

    public Integer calculateSquare(String x){
        Integer number;
        try {
            number  = Integer.valueOf(x);
        } catch (Exception e){
            return 0;
        }
        return number * number;
    }

    public void scanInteger(){
        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            System.out.println(a);

            int c = scan.nextInt();
            System.out.println(c);

            int b = scan.nextInt();
            System.out.println(b);
        }
    }

}
