package com.example.test.hackerrank.dataStructure;

import org.springframework.stereotype.Component;

/**
 * Created by bilga on 14-11-2020
 */
@Component
public class HuffmanDecoding {

    abstract class Node implements Comparable<Node> {
        public  int frequency; // the frequency of this tree
        public  char data;
        public  Node left, right;
        public Node(int freq) {
            frequency = freq;
        }

        // compares on the frequency
        public int compareTo(Node tree) {
            return frequency - tree.frequency;
        }
    }

    class HuffmanLeaf extends Node {

        public HuffmanLeaf(int freq, char val) {
            super(freq);
            data = val;
        }
    }

    class HuffmanNode extends Node {

        public HuffmanNode(Node l, Node r) {
            super(l.frequency + r.frequency);
            left = l;
            right = r;
        }

    }

    void decode(String s, Node root) {
        if (s.isEmpty() || s.length() > 25){
            System.out.print("");
        }

        StringBuilder sb = new StringBuilder();
        Node node = root;
        for (int i = 0; i < s.length(); i++) {
            node = s.charAt(i) == '1' ? node.right : node.left;
            if (node.left == null && node.right == null) {
                sb.append(node.data);
                node = root;
            }
        }
        System.out.print(sb);

    }
}
