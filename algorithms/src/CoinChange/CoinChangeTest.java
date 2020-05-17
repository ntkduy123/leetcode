package algorithms.src.CoinChange;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinChangeTest {
    @Test
    public void coinChangeTest() {
        CoinChange coinChange = new CoinChange();
//        assertEquals(1, coinChange.coinChange(new int[]{1, 2}, 1));
//        assertEquals(-1, coinChange.coinChange(new int[]{2}, 3));
        assertEquals(4, coinChange.coinChange(new int[]{2,5,10,1}, 27));
    }
}
