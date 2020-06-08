package de.danielweidle.kata.directionsreduction;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DirReductionTest {
    @Test
    public void testSimpleDirReduc() {
        assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
                new String[] { "WEST" },
                DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" }));
        assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"", new String[] {},
                DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH" }));
    }

    @Test
    public void testDirReducShoudRemoveOppositDirectionsReduced() throws Exception {
        final String[] result = DirReduction.dirReduc(new String[] { "NORTH", "SOUTH" });

        assertArrayEquals(new String[] {}, result);
    }

    @Test
    public void testDirNorthShouldReturnNorth() throws Exception {
        final String[] result = DirReduction.dirReduc(new String[] { "NORTH" });

        assertArrayEquals(new String[] { "NORTH" }, result);
    }
}