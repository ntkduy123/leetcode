package algorithms.src.NumberIslands;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberIslandsTest {
    @Test
    public void numIslands() {
        NumberIslands numberIslands = new NumberIslands();
        assertEquals(1, numberIslands.numIslands(new char[][]{{'1'}, {'1'}}));
        assertEquals(3, numberIslands.numIslands(new char[][]{{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}}));
    }
}
