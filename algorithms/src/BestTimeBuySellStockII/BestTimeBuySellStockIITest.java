package algorithms.src.BestTimeBuySellStockII;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeBuySellStockIITest {
    @Test
    public void maxProfit() {
        BestTimeBuySellStockII bestTimeBuySellStockII = new BestTimeBuySellStockII();
        assertEquals(7, bestTimeBuySellStockII.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(4, bestTimeBuySellStockII.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, bestTimeBuySellStockII.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
