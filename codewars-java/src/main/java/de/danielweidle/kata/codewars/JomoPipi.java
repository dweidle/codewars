package de.danielweidle.kata.codewars;

import java.util.HashMap;
import java.util.Map;

public class JomoPipi {

    public static String numericals(final String s) {
        final Map<Character, Integer> charCounts = new HashMap<>();
        final StringBuilder sb = new StringBuilder();
        for (final Character c : s.toCharArray()) {
            if (!charCounts.containsKey(c)) {
                charCounts.put(c, 1);
                sb.append(1);
            } else {
                final int occurrence = charCounts.get(c) + 1;
                charCounts.put(c, occurrence);
                sb.append(occurrence);
            }
        }
        return sb.toString();
    }

}
