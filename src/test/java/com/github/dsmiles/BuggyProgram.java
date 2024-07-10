package com.github.dsmiles;

public class BuggyProgram {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 5;
        int index = findIndex(numbers, target);

        if (index != -1) {
            System.out.println("Found target " + target + " at index: " + index);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }

    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
