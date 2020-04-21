package algorithms.src.MaximumSubarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubarrayTest {
    @Test
    public void maxSubArrayTest() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        assertEquals(6, maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
