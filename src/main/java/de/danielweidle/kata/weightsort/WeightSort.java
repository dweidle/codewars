package de.danielweidle.kata.weightsort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeightSort {

    public static String orderWeight(String strng) {
        return Arrays.stream(strng.split(" "))
                .sorted(WeightSort::compareByDigitSumAndNaturalOrder)
                .collect(Collectors.joining(" "));
    }

    private static int compareByDigitSumAndNaturalOrder(String s, String s1) {
        if(digitSum(s) == digitSum(s1)) {
            return s.compareTo(s1);
        }
        return Integer.compare(digitSum(s), digitSum(s1));
    }

    private static int digitSum(final String val) {
        return val.chars().map(c -> c-48).sum();
    }
}