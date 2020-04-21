package algorithms.src.MaximumAverageSubarrayI;

public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        for (int i = 0; i < k; i++) {
            avg += (double) nums[i] / k;
        }

        double result = avg;
        for (int i = k; i < nums.length; i++) {
            avg = avg + (double) nums[i] / k - (double) nums[i - k] / k;
            if (avg > result) {
                result = avg;
            }
        }

        return result;
    }
}
