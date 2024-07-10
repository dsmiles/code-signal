package com.github.dsmiles;

public class YetAnotherBuggyProgram {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry"};
        String concatenated = concatenateStrings(words);
        System.out.println("Concatenated String: " + concatenated);
    }

    public static String concatenateStrings(String[] strings) {
        // must check your input values are valid
        if (strings.length == 0) {
            return "";
        }

        // could use string builder for better performance building strings
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str).append(", ");
        }
        return result.substring(0, result.length() - 2);  // Remove the trailing comma and space
    }
}

