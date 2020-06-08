package de.danielweidle.codewars.printererrors

import org.junit.Test
import kotlin.test.assertEquals

class PrinterErrorsTest {

    private val classUnderTest = PrinterErrors();

    @Test
    fun testFixed() {
        assertEquals("3/56", classUnderTest.printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"))
        assertEquals("6/60", classUnderTest.printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"))
        assertEquals("11/65", classUnderTest.printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyzuuuuu"))
        assertEquals("0/53", classUnderTest.printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmm"))
    }
}

