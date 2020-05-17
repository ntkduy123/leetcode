package algorithms.src.MaximumSumCircularSubarray;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] A) {
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < A.length; i++) {
            cur += A[i];
            if (cur > max) {
                max = cur;
            }

            if (cur < 0) {
                cur = 0;
            }
        }

        cur = 0;
        int maxSoFar = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = A.length - 1; i >= 2; i--) {
            cur += A[i];
            if (cur > maxSoFar) {
                maxSoFar = cur;
            }
            map.put(i, maxSoFar);
        }

        maxSoFar = Integer.MIN_VALUE;
        cur = 0;
        for (int i = 0; i < A.length; i++) {
            cur += A[i];
            if ((cur + map.get(i + 2)) > maxSoFar) {
                maxSoFar = cur + map.get(i + 2);
            }
        }

        return Math.max(max, maxSoFar);
    }
}
