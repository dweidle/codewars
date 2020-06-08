package de.danielweidle.kata.dinglemouse;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class DinglemouseTest {

    @Test
    public void test() {
        assertArrayEquals(new int[]{8, 8, 9, 9, 10, 10}, Dinglemouse.sort(new int[]{8, 8, 9, 9, 10, 10}));
        assertArrayEquals(new int[]{4, 1, 3, 2}, Dinglemouse.sort(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{9, 999, 99}, Dinglemouse.sort(new int[]{9, 99, 999}));
    }

    @Test
    public void handleThreeDigitSort() {
        assertArrayEquals(new int[]{9, 999, 99}, Dinglemouse.sort(new int[]{9, 99, 999}));
    }

    @Test
    public void handleOneDigitSort() {
        assertArrayEquals(new int[]{4, 1, 3, 2}, Dinglemouse.sort(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void handleTwoDigitSort() {
        assertArrayEquals(new int[]{4, 1, 32, 23}, Dinglemouse.sort(new int[]{1, 4, 32, 23}));
    }

    @Test
    public void translateShouldReturnTranslationOfOneSizeDigit() {
        assertThat(Dinglemouse.translate(1)).isEqualTo("one");
        assertThat(Dinglemouse.translate(2)).isEqualTo("two");
        assertThat(Dinglemouse.translate(0)).isEqualTo("zero");
    }

    @Test
    public void translateShouldReturnTranslationOfTwoSizeDigit() {
        assertThat(Dinglemouse.translate(10)).isEqualTo("ten");
        assertThat(Dinglemouse.translate(11)).isEqualTo("eleven");
        assertThat(Dinglemouse.translate(22)).isEqualTo("twentytwo");
        assertThat(Dinglemouse.translate(44)).isEqualTo("fourtyfour");
    }

    @Test
    public void zeroShouldBeSortedAsWell() {
        assertArrayEquals(new int[]{4, 1, 3, 2, 0}, Dinglemouse.sort(new int[]{0, 1, 2, 3, 4}));
    }

    @Test
    public void testLowerBounds() {
        assertThat(Dinglemouse.sort(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18}))
                .isEqualTo(new int[]{8, 18, 11, 15, 5, 4, 14, 9, 1, 7, 17, 6, 16, 10, 13, 3, 12, 2,0});
    }

    @Test
    public void testThreeAndTwoDigitSort() {
        assertArrayEquals(new int[]{414,49}, Dinglemouse.sort(new int[]{49,414}));
    }
}