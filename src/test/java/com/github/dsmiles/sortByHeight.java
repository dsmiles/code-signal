package com.github.dsmiles;

import java.util.ArrayList;
import java.util.Collections;

public class sortByHeight {

    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] sortedArray = solution(a);

        // Print the sorted array
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static int[] solution(int[] a) {

        // create an array that does not contain trees
        ArrayList<Integer> heights = new ArrayList<>();

        // iterate over the array
        for (int height : a) {
            // skip the trees
            if (height != -1) {
                heights.add(height);
            }
        }

        // now sort the array
        Collections.sort(heights);

        // create new array to hold all values
        int[] result = new int[a.length];
        int index = 0;

        // now add trees and sorted values to new array
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                result[i] = -1;                 // a tree
            } else {
                result[i] = heights.get(index); // a person
                index++;
            }
        }

        return result;
    }

}
