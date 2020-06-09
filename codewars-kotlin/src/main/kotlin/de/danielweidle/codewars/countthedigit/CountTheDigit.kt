package de.danielweidle.codewars.countthedigit

/**
 * https://www.codewars.com/kata/566fc12495810954b1000030/train/kotlin
 */
fun nbDig(n: Int, d: Int): Int {
    return (0..n)
            .map { it.times(it) }
            .map { it.toString() }
            .flatMap { it.toList() }
            .groupingBy { it }
            .eachCount()
            .getOrElse(d.toString()[0], { 0 })
}