package de.danielweidle.kata.ismyfriendcheating;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RemovedNumbersTest {
    @Test
    public void test12() {
        final List<long[]> res = new ArrayList<long[]>();
        res.add(new long[] { 15, 21 });
        res.add(new long[] { 21, 15 });
        final List<long[]> a = RemovedNumbers.removNb(26);
        assertArrayEquals(res.get(0), a.get(0));
        assertArrayEquals(res.get(1), a.get(1));
    }

    @Test
    public void test14() {
        final List<long[]> res = new ArrayList<long[]>();
        final List<long[]> a = RemovedNumbers.removNb(100);
        assertTrue(res.size() == a.size());
    }
}