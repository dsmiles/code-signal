package com.github.dsmiles;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Given an array of integers, find the pair of adjacent elements that has the largest
 * product and return that product.
 * <p>
 * Example
 * <p>
 * For inputArray = [3, 6, -2, -5, 7, 3], the output should be
 * solution(inputArray) = 21.
 * <p>
 * 7 and 3 produce the largest product.
 */
public class AdjacentElementsProductTest {

    int solution(int[] inputArray) {
        int largestProduct = Integer.MIN_VALUE;

        for (int i = 0; i < inputArray.length - 1; i++) {
            int product = inputArray[i] * inputArray[i + 1];

            if (product > largestProduct) {
                largestProduct = product;
            }
        }
        return largestProduct;
    }

    @ParameterizedTest
    @CsvSource({
            "3, 6, -2, -5, 7, 3, 21",
            "-1, -2, -3, -4, -5, -6, 20",
            "5, 1, 2, 3, 1, 4, 6",
            "10, 20, -20, -10, 40, -30, 400"
    })
    public void testSolution(int a, int b, int c, int d, int e, int f, int expectedResult) {
        int[] inputArray = {a, b, c, d, e, f};
        assertEquals(expectedResult, solution(inputArray));
    }

    @ParameterizedTest
    @CsvSource({
            "-1, -2, 2",
    })
    public void testSolution(int a, int b, int expectedResult) {
        int[] inputArray = {a, b};
        assertEquals(expectedResult, solution(inputArray));
    }
}
