package de.danielweidle.kata.tortoiseracing;

/**
 * https://www.codewars.com/kata/tortoise-racing/train/java
 */
public class Tortoise {

    public static final int SECONDS_PER_HOUR = 3600;

    /**
     *
     * @param v1
     *            Speed of a (feet per hour)
     * @param v2
     *            Speed of b (feet per hour)
     * @param lead
     *            Lead (feet)
     * @return [hour, min, sec] which is the time needed in hours, minutes and
     *         seconds
     */
    public static int[] race(final int v1, final int v2, final int lead) {
        if (v1 >= v2) {
            return null;
        }

        final Dot v1p1 = new Dot(0, 0);
        final Dot v1p2 = new Dot(SECONDS_PER_HOUR, v1);
        final Dot v2p1 = new Dot(0, 0);
        final Dot v2p2 = new Dot(SECONDS_PER_HOUR, v2);
        final double v1st = (v1p2.getY() - v1p1.getY()) / (v1p2.getX() - v1p1.getX() + 0.0);
        final double v2st = (v2p2.getY() - v2p1.getY()) / (v2p2.getX() - v2p1.getX() + 0.0);
        final double x = v2st - v1st;
        final double timeToCatch = lead / x;
        return secondsToHoursMinutesSeconds((int) timeToCatch);
    }

    private static class Dot {
        final int x;
        final int y;

        public Dot(final int x, final int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

    }

    private static int[] secondsToHoursMinutesSeconds(final int seconds) {
        final int h = seconds / 3600;
        final int remaining = seconds - h * 3600;
        final int m = remaining / 60;
        final int s = remaining - m * 60;
        return new int[] { h, m, s };
    }

    public static void main(final String[] args) {
        Tortoise.race(20, 20, 0);
    }

}
