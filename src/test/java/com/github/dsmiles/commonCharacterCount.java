package com.github.dsmiles;

/**
 * Given two strings, find the number of common characters between them.
 * <p>
 * Example
 * <p>
 * For s1 = "aabcc" and s2 = "adcaa", the output should be
 * solution(s1, s2) = 3.
 * <p>
 * Strings have 3 common characters - 2 "a"s and 1 "c".
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [memory limit] 1 GB
 * <p>
 * [input] string s1
 * <p>
 * A string consisting of lowercase English letters.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ s1.length < 15.
 * <p>
 * [input] string s2
 * <p>
 * A string consisting of lowercase English letters.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ s2.length < 15.
 * <p>
 * [output] integer
 */


public class commonCharacterCount {

    public static int solution(String s1, String s2) {

        // Create frequency arrays for both strings
        int[] freq1 = new int[256]; // Assuming ASCII characters
        int[] freq2 = new int[256];

        // Fill the frequency array for the first string
        for (char c : s1.toCharArray()) {
            freq1[c]++;
            System.out.println("s1: char is = " + c + " has position " + (int) c + " count is " + freq1[c]);
        }

        System.out.println();

        // Fill the frequency array for the second string
        for (char c : s2.toCharArray()) {
            freq2[c]++;
            System.out.println("s2: char is = " + c + " has position " + (int) c + " count is " + freq1[c]);
        }

        // Calculate the number of common characters
        int commonCount = 0;

        for (int i = 0; i < 256; i++) {
            System.out.print("i = " + i);
            System.out.print(" freq1[i] = " + freq1[i]);
            System.out.print(" freq2[i] = " + freq2[i]);

            int result = Math.min(freq1[i], freq2[i]);
            commonCount += result;

            System.out.print(" result = " + result);
            System.out.println(" commonCount = " + commonCount);
        }

        return commonCount;
    }

    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "apricot";

        int commonCharacters = solution(str1, str2);

        System.out.println("Number of common characters: " + commonCharacters);

        String str3 = "aabcc";
        String str4 = "adcaa";

        commonCharacters = solution(str3, str4);

        System.out.println("Number of common characters: " + commonCharacters);

    }
}
