package algorithms.src.ClimbingStairs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {
    @Test
    public void climbStairsTest() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(2, climbingStairs.climbStairs(2));
        assertEquals(3, climbingStairs.climbStairs(3));
        assertEquals(5, climbingStairs.climbStairs(4));
    }
}
