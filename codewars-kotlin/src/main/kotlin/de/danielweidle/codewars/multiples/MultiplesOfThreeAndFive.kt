package de.danielweidle.codewars.multiples

/**
 * https://www.codewars.com/kata/514b92a657cdc65150000006/train/kotlin
 */
fun solution(number: Int): Int {
    return (0 until number)
            .filter { it % 3 == 0 || it % 5 == 0 }
            .sum()
}