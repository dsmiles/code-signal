package com.github.dsmiles;

import java.sql.SQLOutput;

public class alternatingSums {

    public static void main(String[] args) {

        int[] a = {50, 60, 60, 45, 70};
        int[] result = solution(a);
        System.out.println("Solution 3");
        System.out.println("Total weight of team 1: " + result[0]);
        System.out.println("Total weight of team 2: " + result[1]);

        int[] result2 = solution2(a);
        System.out.println("Solution 3");
        System.out.println("Total weight of team 1: " + result2[0]);
        System.out.println("Total weight of team 2: " + result2[1]);

        int[] result3 = solution3(a);
        System.out.println("Solution 3");
        System.out.println("Total weight of team 1: " + result3[0]);
        System.out.println("Total weight of team 2: " + result3[1]);
    }

    public static int[] solution(int[] a) {

        int team1 = 0;
        int team2 = 0;
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (index == 0) {
                team1 += a[i];
            } else {
                team2 += a[i];
            }
            index = (index == 1) ? 0 : 1;
        }

        return new int[]{team1, team2};
    }

    public static int[] solution2(int[] a) {

        int team1 = 0;
        int team2 = 0;
        int index = 0;

        for (int j : a) {
            if (index == 0) {
                team1 += j;
            } else {
                team2 += j;
            }
            index = (index == 1) ? 0 : 1;
        }

        return new int[]{team1, team2};
    }

    public static int[] solution3(int[] a) {

        int team1 = 0;
        int team2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                team1 += a[i];
            } else {
                team2 += a[i];
            }
        }

        return new int[]{team1, team2};
    }

}
