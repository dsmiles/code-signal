package com.github.dsmiles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BuggyListProgram {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Attempt to remove an element
        removeNumber3(numbers, 20);

        // Print the remaining elements
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }

    public static void removeNumber(List<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                list.remove(i);
            }
        }
    }

    public static void removeNumber2(List<Integer> list, int value) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == value) {
                iterator.remove();
            }
        }
    }

    public static void removeNumber3(List<Integer> list, int value) {
        list.removeIf(integer -> integer == value);
    }
}

