package de.danielweidle.kata.maxsubarraysum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxSequenceTest {
    @Test
    public void testEmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0, Max.sequence(new int[]{}));
    }
    @Test
    public void testExampleArray() throws Exception {
        assertEquals("Example array should have a max of 6", 6, Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void testOnlyNegativeShouldReturnZero() {
        assertEquals("Example array should have a max of 0", 0, Max.sequence(new int[]{-2, -5, -1}));
    }

    @Test
    public void testRespectDuplicates() {
        assertEquals("Example array should have a max of 3", 3, Max.sequence(new int[]{1,1,1}));
    }
}