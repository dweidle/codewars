package de.danielweidle.codewars.countthedigit

import org.junit.Assert.assertEquals
import org.junit.Test

class CountTheDigitKtTest {
    private fun testing(actual: Int, expected: Int) {
        assertEquals(expected.toLong(), actual.toLong())
    }

    @Test
    fun test() {
        println("Fixed Tests nbDig")
        testing(nbDig(3,8), 0)
        testing(nbDig(5750, 0), 4700)
        testing(nbDig(11011, 2), 9481)
    }

    @Test fun test2() {
        testing(nbDig(10,1), 4)
    }
}