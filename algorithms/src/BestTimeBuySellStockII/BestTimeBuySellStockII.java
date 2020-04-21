package algorithms.src.BestTimeBuySellStockII;

public class BestTimeBuySellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int result = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                result += prices[i - 1] - buy;
                buy = prices[i];
            } else if (i == prices.length - 1) {
                result += prices[i] - buy;
            }
        }
        return result;
    }
}
