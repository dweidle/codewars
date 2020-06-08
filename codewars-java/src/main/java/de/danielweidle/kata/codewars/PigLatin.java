package de.danielweidle.kata.codewars;

/**
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f
 */
public class PigLatin {

    public static String pigIt(final String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
