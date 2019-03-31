package de.danielweidle.kata.countduplicates;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.danielweidle.kata.countduplicates.CountingDuplicates;

public class CountingDuplicatesTest {

    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }

    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        final String testThousandA = new String(new char[1000]).replace('\0', 'a');
        final String testHundredB = new String(new char[100]).replace('\0', 'b');
        final String testTenC = new String(new char[10]).replace('\0', 'c');
        final String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        final String test1d = new String(new char[1]).replace('\0', 'd');
        final String test = test1d + test1CapitalA + testTenC + testHundredB + testThousandA;

        assertEquals(3, CountingDuplicates.duplicateCount(test));
    }
}
