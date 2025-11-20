package com.example.util;

public class TextTools {
    /**
     * Capitalizes the first letter of the given string.
     * @param s the input string
     * @return the capitalized string
     */
    public static String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
}