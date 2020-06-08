package de.danielweidle.kata.dinglemouse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/56f4ff45af5b1f8cd100067d
 */
public class Dinglemouse {

    private static Map<Integer, String> dict = new HashMap<>();

    static {
        dict.putIfAbsent(0, "zero");
        dict.putIfAbsent(1, "one");
        dict.putIfAbsent(2, "two");
        dict.putIfAbsent(3, "three");
        dict.putIfAbsent(4, "four");
        dict.putIfAbsent(5, "five");
        dict.putIfAbsent(6, "six");
        dict.putIfAbsent(7, "seven");
        dict.putIfAbsent(8, "eight");
        dict.putIfAbsent(9, "nine");

        dict.putIfAbsent(10, "ten");
        dict.putIfAbsent(11, "eleven");
        dict.putIfAbsent(12, "twelve");
        dict.putIfAbsent(13, "thirteen");
        dict.putIfAbsent(15, "fifteen");
        dict.putIfAbsent(18, "eighteen");

        dict.putIfAbsent(20, "twenty");
        dict.putIfAbsent(30, "thirty");
    }

    public static int[] sort(final int array[]) {
        return Arrays.stream(array).boxed().sorted(Dinglemouse::compareByTranslation).mapToInt(Integer::intValue).toArray();
    }

    private static int compareByTranslation(Integer i1, Integer i2) {
        return translate(i1).compareTo(translate(i2));
    }

    static String translate(final int i) {
        int hundred = ((i / 100) % 100);
        int ten = ((i / 10) % 10);
        int one = i % 10;

        // handle special two digit numbers like 10,11,12 and zero
        if (dict.containsKey(i - hundred) || i == 0) {
            return dict.get(i - hundred);
        }

        String translation = "";
        if (hundred != 0) {
            translation += (dict.get(hundred) + " hundred");
        }
        if( ten == 1) {
            return translation += dict.get(one) + "teen";
        }
        if (ten != 0) {
            if (dict.containsKey(ten * 10)) {
                translation += dict.get(ten * 10);
            } else {
                translation += (dict.get(ten) + "ty");
            }
        }
        translation += dict.get(one);
        return translation;
    }
}