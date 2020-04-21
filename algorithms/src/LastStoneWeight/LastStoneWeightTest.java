package algorithms.src.LastStoneWeight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastStoneWeightTest {
    @Test
    public void lastStoneWeightTest() {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        assertEquals(1, lastStoneWeight.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
