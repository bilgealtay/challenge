package com.example.test;

import java.awt.Cursor;

public class CursorHelper {

    public static Cursor getPredefinedCursor(int type) {
        /**
         * Returns a cursor object with the specified predefined type.
         *
         * @param type The type of predefined cursor, as defined by constants in the Cursor class
         *             (e.g., Cursor.HAND_CURSOR, Cursor.WAIT_CURSOR).
         * @return A Cursor object representing the specified predefined cursor type.
         */
        return Cursor.getPredefinedCursor(type);
    }
}