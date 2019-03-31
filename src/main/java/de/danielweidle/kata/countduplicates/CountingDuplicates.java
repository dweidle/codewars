package de.danielweidle.kata.countduplicates;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/counting-duplicates/train/java
 */
public class CountingDuplicates {

    public static int duplicateCount(final String text) {
        // @formatter:off
        final Map<Character, Long> duplaicatesCountMap = text.chars()
                .mapToObj(c -> (char) c)
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));
        return (int) duplaicatesCountMap.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .count();
        // @formatter:on
    }
}
