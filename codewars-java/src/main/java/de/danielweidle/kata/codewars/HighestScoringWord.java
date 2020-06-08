package de.danielweidle.kata.codewars;

import java.util.Arrays;

import org.apache.commons.lang3.tuple.Pair;

/**
 * https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
 */
public class HighestScoringWord {

    public static String high(final String str) {
        //@formatter:off
        return Arrays.stream(str.split(" "))
                .map(s -> Pair.of(s, s.chars()
                .map(c -> c - 96)
                .sum()))
                .max((p1, p2) -> Integer.compare(p1.getRight(), p2.getRight()))
                .get()
                .getLeft();
      //@formatter:on
    }
}
