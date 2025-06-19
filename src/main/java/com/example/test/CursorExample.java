package com.example.test;

import javax.swing.*;
import java.awt.*;

public class CursorExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cursor Example");
        JLabel label = new JLabel("Hover over me!");

        // Set the cursor to a hand cursor
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        frame.getContentPane().add(label);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}