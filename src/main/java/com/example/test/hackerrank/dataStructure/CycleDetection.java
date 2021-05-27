package com.example.test.hackerrank.dataStructure;

import org.springframework.stereotype.Component;

/**
 * Created by bilga on 14-11-2020
 */
@Component
public class CycleDetection {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static boolean hasCycle(SinglyLinkedListNode head) {

        if (head == null){
            return false;
        }

        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }

        return false;
    }

}
