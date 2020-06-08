package de.danielweidle.codewars.printererrors

/**
https://www.codewars.com/kata/56541980fa08ab47a0000040/train/kotlin
 */
class PrinterErrors {

    fun printerError(s: String): String {
        val length = s.length;
        val errors = s.filter { it > 'm' }.length;
        return "${errors}/${length}";
    }
}