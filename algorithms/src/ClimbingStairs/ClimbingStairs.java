package algorithms.src.ClimbingStairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] cache = new int[n];
        int result = 1;
        for (int i = 0; i < n; i++) {
            if (i <= 2) {
                result = i + 1;
            } else {
                result = cache[i - 1] + cache[i - 2];
            }
            cache[i] = result;
        }

        return result;
    }
}
