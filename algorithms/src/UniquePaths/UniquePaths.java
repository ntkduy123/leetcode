package algorithms.src.UniquePaths;

import java.util.HashMap;
import java.util.Map;

public class UniquePaths {

    private int[][] cache;

    public int uniquePaths(int m, int n) {
        cache = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cache[i][j] = 0;
            }
        }
        return helper(m, n);
    }

    public int helper(int m, int n) {
        if (m == 1 && n == 1) return 1;
        if (cache[m - 1][n - 1] != 0) {
            return cache[m - 1][n - 1];
        } else {
            int result;
            if (m == 1) {
                result = helper(m, n - 1);
            } else if (n == 1) {
                result = helper(m - 1, n);
            } else {
                result = helper(m - 1, n) + helper(m, n - 1);
            }
            cache[m - 1][n - 1] = result;
            return result;
        }
    }
}
