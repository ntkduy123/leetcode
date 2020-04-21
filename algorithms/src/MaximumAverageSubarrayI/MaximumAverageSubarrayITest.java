package algorithms.src.MaximumAverageSubarrayI;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumAverageSubarrayITest {

    @Test
    public void testLongestPalindromicSubstring() {
        int[] nums = {1,12,-5,-6,50,3};

        MaximumAverageSubarrayI maximumAverageSubarrayI = new MaximumAverageSubarrayI();

        assertEquals(12.75, maximumAverageSubarrayI.findMaxAverage(nums, 4), 0);
    }

}
