package de.danielweidle.kata.ismyfriendcheating;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * https://www.codewars.com/kata/is-my-friend-cheating/
 */
public class RemovedNumbers {

    public static List<long[]> removNb(final long n) {
        final List<long[]> findings = new LinkedList<>();
        final Set<Long> alreadycheckd = new HashSet<>();
        final long sumWithoutRemovals = (n * (n + 1)) / 2; // use gauss formula
        for (long i = 1; i < n; i++) {
            for (long j = 1; j < n; j++) {
                if (sumWithoutRemovals - i - j == i * j && !alreadycheckd.contains(j)) {
                    findings.add(new long[] { i, j });
                    findings.add(new long[] { j, i });
                    alreadycheckd.add(i);
                    alreadycheckd.add(j);
                    break;
                }
            }
        }
        return findings;
    }
}
