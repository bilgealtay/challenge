package com.example.test.codewars.control;

import java.util.LinkedList;

/**
 * Created by bilga
 */
public class ReverseLinkedList {
    // Node class to represent each element in the linked list
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            // Store the next node
            next = current.next;

            // Reverse the link
            current.next = prev;

            // Move prev and current one step forward
            prev = current;
            current = next;
        }

        // After the loop, prev will be the new head
        head = prev;
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to add a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        // Append some nodes
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Original list:");
        list.printList();

        // Reverse the linked list
        list.reverse();

        System.out.println("Reversed list:");
        list.printList();
    }
}
