package de.danielweidle.codewars.bouncingballs

import org.junit.Assert.assertEquals
import org.junit.Test

class BouncingBallKtTest {
    @Test
    fun test1() {
        assertEquals(3, bouncingBall(3.0, 0.66, 1.5))
    }

    @Test
    fun test2() {
        assertEquals(15, bouncingBall(30.0, 0.66, 1.5))
    }

    @Test
    fun testRandom() {
        assertEquals(-1, bouncingBall(98.0,9.0,9.8))
    }

}