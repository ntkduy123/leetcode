package algorithms.src.SearchRange;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchRangeTest {
    @Test
    public void searchRangeTest() {
        SearchRange searchRange = new SearchRange();
        int[] result = searchRange.searchRange(new int[]{5,7,7,8,8,10}, 8);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        assertEquals(2, result.length);
    }
}
