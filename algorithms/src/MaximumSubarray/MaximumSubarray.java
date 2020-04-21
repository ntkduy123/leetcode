package algorithms.src.MaximumSubarray;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int num : nums) {
            cur += num;
            if (cur > max) {
                max = cur;
            }

            if (cur < 0) {
                cur = 0;
            }
        }
        return max;
    }
}
