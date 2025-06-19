package com.example.test.coderByte;

import java.util.*;

/**
 * Created by bilga
 */
public class TreeConstructor {

    public static String TreeConstructor(String[] strArr) {
        Map<Integer, List<Integer>> parentToChildren = new HashMap<>();
        Map<Integer, Integer> childToParent = new HashMap<>();

        for (String pair : strArr) {
            // Extract numbers from the string
            pair = pair.replaceAll("[()]", "");
            String[] parts = pair.split(",");
            int child = Integer.parseInt(parts[0]);
            int parent = Integer.parseInt(parts[1]);

            // Rule 1: Each child has only one parent
            if (childToParent.containsKey(child)) {
                return "false";
            }
            childToParent.put(child, parent);

            // Rule 2: Each parent has at most two children
            parentToChildren.computeIfAbsent(parent, k -> new ArrayList<>()).add(child);
            if (parentToChildren.get(parent).size() > 2) {
                return "false";
            }
        }

        // Rule 3: Only one root node (a node that is a parent but never a child)
        Set<Integer> allNodes = new HashSet<>();
        allNodes.addAll(parentToChildren.keySet());
        allNodes.addAll(childToParent.keySet());

        int rootCount = 0;
        for (Integer node : allNodes) {
            if (!childToParent.containsKey(node)) {
                rootCount++;
            }
        }

        return rootCount == 1 ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(TreeConstructor(new String[]{"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"})); // true
        System.out.println(TreeConstructor(new String[]{"(1,2)", "(3,2)", "(2,12)", "(5,2)"})); // false
    }
}
