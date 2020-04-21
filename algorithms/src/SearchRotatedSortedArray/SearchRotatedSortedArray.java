package algorithms.src.SearchRotatedSortedArray;

public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0, right = nums.length - 1, pivot = 0;
        while (left <= right) {
            pivot = (left + right) / 2;
            if (target == nums[pivot]) return pivot;
            if (nums[pivot] >= nums[left]) {
                if (target < nums[pivot] && target >= nums[left]) {
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }
            } else {
                if (target > nums[pivot] && target <= nums[right]) {
                    left = pivot + 1;
                } else {
                    right = pivot - 1;
                }
            }
        }

        return -1;
    }
}
