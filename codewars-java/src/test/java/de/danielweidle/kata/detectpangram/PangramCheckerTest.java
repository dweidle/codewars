package de.danielweidle.kata.detectpangram;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PangramCheckerTest {

    @Test
    public void test1() {
        final String pangram1 = "The quick brown fox jumps over the lazy dog.";
        final PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(pangram1));
    }

    @Test
    public void test2() {
        final String pangram2 = "You shall not pass!";
        final PangramChecker pc = new PangramChecker();
        assertEquals(false, pc.check(pangram2));
    }

}
