package algorithms.src.SingleElementSortedArray;

public class SingleElementSortedArray {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        int left = 0, right = nums.length - 1;
        int pivot = 0;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (pivot == nums.length - 1 || pivot == 0) return nums[pivot];
            int length = right - left + 1;
            if (nums[pivot + 1] == nums[pivot]) {
                if (length % 4 == 3) {
                    right = pivot - 1;
                } else {
                    left = pivot;
                }
            } else {
                if (nums[pivot - 1] == nums[pivot]) {
                    if (length % 4 == 3) {
                        left = pivot + 1;
                    } else {
                        right = pivot;
                    }
                } else {
                    return nums[pivot];
                }
            }
        }

        return -1;
    }
}
