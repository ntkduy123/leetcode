package algorithms.src.CoinChange;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {
    private Map<Integer, Integer> cache = new HashMap<>();

    public int result = 0;

    public int coinChange(int[] coins, int amount) {
        int ans = helper(coins, amount);
        return ans;
    }

    public int helper(int[] coins, int amount) {
        if (amount < 0) return -1;
        if (amount == 0) return 0;

        int nCoins;
        for (int coin : coins) {
            int nextCoin = amount - coin;
            if (cache.containsKey(nextCoin)) {
                nCoins = cache.get(nextCoin);
            } else {
                nCoins = helper(coins, amount - coin);
                cache.put(nextCoin, nCoins);
            }

            if (nCoins >= 0) {
                result = 1 + Math.min(result, nCoins);
            } else {
                if (result == 0) result = -1;
            }
        }

        return result;
    }
}
