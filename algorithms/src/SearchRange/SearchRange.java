package algorithms.src.SearchRange;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1, pivot = 0;
        int[] result = new int[]{-1, -1};
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target && (pivot == 0 || nums[pivot - 1] != target)) {
                result[0] = pivot;
                break;
            }

            if (nums[pivot] >= target) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target && (pivot == nums.length - 1 || nums[pivot + 1] != target)) {
                result[1] = pivot;
                break;
            }

            if (nums[pivot] <= target) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }

        return result;
    }
}
