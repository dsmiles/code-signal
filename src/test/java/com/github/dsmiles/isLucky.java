package com.github.dsmiles;

public class isLucky {

    public static void main(String[] args) {
        int n1 = 1230;
        int n2 = 239017;

        System.out.println(solution(n1)); // true
        System.out.println(solution(n2)); // false
    }

    public static boolean solution(int n) {
        // Convert the number to a string to easily access digits
        String s = Integer.toString(n);
        int len = s.length();

        // Check if the number of digits is even
        if (len % 2 != 0) {
            return false;
        }

        // Calculate the sum of the first half and the second half
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i < len / 2; i++) {
            sumFirstHalf += Character.getNumericValue(s.charAt(i));
        }

        for (int i = len / 2; i < len; i++) {
            sumSecondHalf += Character.getNumericValue(s.charAt(i));
        }

        boolean result = sumFirstHalf == sumSecondHalf;

        // Compare the sums and return the result
        return sumFirstHalf == sumSecondHalf;
    }
}
