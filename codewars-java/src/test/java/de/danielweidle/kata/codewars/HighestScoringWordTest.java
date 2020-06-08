package de.danielweidle.kata.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighestScoringWordTest {
    @Test
    public void sampleTests() {
        assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));
        assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
        assertEquals("abc", HighestScoringWord.high("abc cba aaa"));
        assertEquals("ealnrplnzfqdiwfx", HighestScoringWord.high("ealnrplnzfqdiwfx sdlysxsqydmw"));
        assertEquals("cc", HighestScoringWord.high("aa bb cc"));
    }
}
