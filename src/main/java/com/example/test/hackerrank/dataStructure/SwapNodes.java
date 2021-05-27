package com.example.test.hackerrank.dataStructure;

/**
 * Created by bilga on 14-11-2020
 */

import java.util.*;

public class SwapNodes {

    class Node {
        Node left, right;
        int data;
        Node(int x) {
            this.data = x;
            this.left = this.right = null;
        }
    }

    void inorder(Node t) {
        if(t == null)   return;
        inorder(t.left);
        System.out.print(t.data + " ");
        inorder(t.right);
    }

    void dfs(Node t, int y) {
        if(t == null)   return;
        // add node label (at depth y) to the arraylist depth at index y
        depth[y].add(t.data);
        dfs(t.left, y + 1);
        dfs(t.right, y + 1);
    }

    Node tree[];
    ArrayList<Integer> depth[];

    void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree = new Node[n + 1];
        depth = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) {
            tree[i] = new Node(i);
            depth[i] = new ArrayList<>();
        }

        for(int i = 1; i <= n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l != -1) {
                tree[i].left = tree[l];
            }
            if(r != -1) {
                tree[i].right = tree[r];
            }
        }

        dfs(tree[1], 1);

        int t = sc.nextInt();
        while(t-- > 0) {
            int k = sc.nextInt();
            int h = k;
            while(h <= n) {
                // swap children of each node at depth h
                for(int d : depth[h]) {
                    Node temp = tree[d].left;
                    tree[d].left = tree[d].right;
                    tree[d].right = temp;
                }
                // h is all the possible multiples of k where we have to swap nodes
                h += k;
            }
            inorder(tree[1]);
            System.out.println();
        }
    }

}