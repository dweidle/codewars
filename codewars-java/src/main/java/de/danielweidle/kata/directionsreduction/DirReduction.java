package de.danielweidle.kata.directionsreduction;

import org.apache.commons.lang3.ArrayUtils;

/**
 * https://www.codewars.com/kata/directions-reduction/train/java
 */
public class DirReduction {

    public static String[] dirReduc(final String[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i].equals("NORTH") && arr[i + 1].equals("SOUTH"))
                    || (arr[i].equals("SOUTH") && arr[i + 1].equals("NORTH"))
                    || (arr[i].equals("EAST") && arr[i + 1].equals("WEST"))
                    || (arr[i].equals("WEST") && arr[i + 1].equals("EAST"))) {

                return dirReduc(ArrayUtils.removeAll(arr, i, i + 1));

            }
        }

        return arr;
    }

}
