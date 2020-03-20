package de.danielweidle.kata.maxsubarraysum;

/**
 * https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c
 */
public class Max {
    public static int sequence(int[] arr) {
        int maxTotal = 0;
        int maxCurrent = 0;

        for (int i = 0; i < arr.length; i++) {
            maxCurrent = maxCurrent + arr[i];
            if (maxTotal < maxCurrent) {
                maxTotal = maxCurrent;
            }
            if (maxCurrent < 0) {
                maxCurrent = 0;
            }
        }
        return maxTotal;
    }
}
