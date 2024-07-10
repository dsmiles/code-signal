package com.github.dsmiles;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * G iven a year, return the century it is in. The first century spans from the year 1 up to
 * and including the year 100, the second - from the year 101 up to and including the year 200, etc.
 * <p>
 * Example
 * <p>
 * For year = 1905, the output should be
 * solution(year) = 20;
 * For year = 1700, the output should be
 * solution(year) = 17.
 */
public class CenturyFromYearTest {

    private int solution(int year) {
        return (year + 99) / 100;
    }

    @ParameterizedTest
    @CsvSource({
            "1900, 19",
            "1999, 20",
            "2000, 20",
            "2021, 21",
            "2100, 21"
    })
    public void testSolution(int year, int expectedCentury) {
        assertEquals(expectedCentury, solution(year));
    }

}
