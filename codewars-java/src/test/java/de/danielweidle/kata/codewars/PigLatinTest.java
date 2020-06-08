package de.danielweidle.kata.codewars;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PigLatinTest {

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }

    @Test
    public void swf() {
        final String s = "Pig latin is cool ";
        Arrays.stream(s.split("\\s(?=[a-zA-Z])")).forEach(System.out::println);
        assertEquals("igPay atinlay siay oolcay ", PigLatin.pigIt("Pig latin is cool "));
    }

}
