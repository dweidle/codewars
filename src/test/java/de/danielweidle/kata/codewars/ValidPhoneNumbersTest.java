package de.danielweidle.kata.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidPhoneNumbersTest {

    @Test
    public void tests() {
        assertEquals(true, ValidPhoneNumbers.validPhoneNumber("(123) 456-7890"));
        assertEquals(false, ValidPhoneNumbers.validPhoneNumber("(1111)555 2345"));
        assertEquals(false, ValidPhoneNumbers.validPhoneNumber("(098) 123 4567"));
    }

}
