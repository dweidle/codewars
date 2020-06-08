package de.danielweidle.kata.humanreadabletime;

/**
 * https://www.codewars.com/kata/52685f7382004e774f0001f7
 */
public class HumanReadableTime {

    private static final int SECONDS_PER_HOUR = 60 * 60;
    private static final int SECONDS_PER_MINUTE = 60;

    public static void main(final String[] args) {
        System.out.println(HumanReadableTime.makeReadable(60));
    }

    /**
     * Write a function, which takes a non-negative integer (seconds) as input and
     * returns the time in a human-readable format (HH:MM:SS)
     *
     * HH = hours, padded to 2 digits, range: 00 - 99 MM = minutes, padded to 2
     * digits, range: 00 - 59 SS = seconds, padded to 2 digits, range: 00 - 59 The
     * maximum time never exceeds 359999 (99:59:59)
     *
     * You can find some examples in the test fixtures.
     *
     */
    public static String makeReadable(int seconds) {
        final int hours = seconds / SECONDS_PER_HOUR;
        seconds -= hours * SECONDS_PER_HOUR;
        final int minutes = seconds / SECONDS_PER_MINUTE;
        seconds -= minutes * SECONDS_PER_MINUTE;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
