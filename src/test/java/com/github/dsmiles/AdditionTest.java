package com.github.dsmiles;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Write a function that returns the sum of two numbers.
 * <p>
 * Example
 * <p>
 * For param1 = 1 and param2 = 2, the output should be
 * solution(param1, param2) = 3.
 */
public class AdditionTest {

    public int solution(int param1, int param2) {
        return param1 + param2;
    }

    @ParameterizedTest
    @CsvSource({
            "3, 5, 8",
            "-3, -5, -8",
            "3, -5, -2",
            "3, 0, 3"
    })
    public void testAddition(int a, int b, int expectedResult) {
        int result = solution(a, b);
        assertEquals(expectedResult, result);
    }
}
