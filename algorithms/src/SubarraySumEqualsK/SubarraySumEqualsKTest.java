package algorithms.src.SubarraySumEqualsK;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SubarraySumEqualsKTest {
    @Test
    public void subarraySum() {
        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();
//        assertEquals(2, subarraySumEqualsK.subarraySum(new int[]{1, 1}, 2));
        assertEquals(3, subarraySumEqualsK.subarraySum(new int[]{10, 2, -2, -20, 10}, -10));
        assertEquals(2, subarraySumEqualsK.subarraySum(new int[]{9, 4, 20, 3, 10, 5}, 33));
    }
}
