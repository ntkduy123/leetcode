package algorithms.src.SingleNumber;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        Set<Integer> set = new HashSet<>();

        for (int val : nums) {
            sum1 += val;
            if (!set.contains(val)) {
                set.add(val);
                sum2 += val;
            }
        }

        return 2 * sum2 - sum1;
    }
}
