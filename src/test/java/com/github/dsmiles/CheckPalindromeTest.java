package com.github.dsmiles;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Given the string, check if it is a palindrome.
 * <p>
 * Example
 * <p>
 * For inputString = "aabaa", the output should be
 * solution(inputString) = true;
 * <p>
 * For inputString = "abac", the output should be
 * solution(inputString) = false;
 * <p>
 * For inputString = "a", the output should be
 * solution(inputString) = true.
 */
public class CheckPalindromeTest {

    private boolean solution(String inputString) {
        String reverse = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse = reverse + inputString.charAt(i);
        }

        return inputString.equals(reverse);
    }

    @ParameterizedTest
    @CsvSource({
            "radar, true",
            "level, true",
            "deified, true",
            "hello, false",
            "world, false",
            "Palindrome, false",
            "A, true",
            "racecar, true"
    })
    public void testSolution(String inputString, boolean expected) {
        assertEquals(expected, solution(inputString));
    }
}
