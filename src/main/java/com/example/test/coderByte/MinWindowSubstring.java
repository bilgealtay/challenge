package com.example.test.coderByte;

import java.util.*;
import java.util.stream.Collectors;

public class MinWindowSubstring {

    public static String minWindowSubstring(String[] strArr) {
        String s = strArr[0];
        String t = strArr[1];

        if (s.length() < t.length()) return "";

        // Build frequency map for string t using Java 8 streams
        Map<Character, Long> needMap = t.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Map<Character, Long> windowMap = new HashMap<>();
        int left = 0, have = 0, need = needMap.size();
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            windowMap.compute(c, (k, v) -> v == null ? 1L : v + 1);

            if (needMap.containsKey(c) && windowMap.get(c).equals(needMap.get(c))) {
                have++;
            }

            while (have == need) {
                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left++);
                windowMap.compute(leftChar, (k, v) -> v - 1);

                if (needMap.containsKey(leftChar) && windowMap.get(leftChar) < needMap.get(leftChar)) {
                    have--;
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        System.out.println(minWindowSubstring(new String[]{"aaabaaddae", "aed"}));         // dae
        System.out.println(minWindowSubstring(new String[]{"aabdccdbcacd", "aad"}));       // aabd
        System.out.println(minWindowSubstring(new String[]{"ahffaksfajeeubsne", "jefaa"})); // aksfaje
        System.out.println(minWindowSubstring(new String[]{"aaffhkksemckelloe", "fhea"}));  // affhkkse
    }
}