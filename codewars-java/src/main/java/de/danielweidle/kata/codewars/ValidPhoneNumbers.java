package de.danielweidle.kata.codewars;

import java.util.regex.Pattern;

public class ValidPhoneNumbers {

    public static boolean validPhoneNumber(final String phoneNumber) {
        return Pattern.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}", phoneNumber);
    }
}
