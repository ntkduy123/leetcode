package algorithms.src.ValidSequenceRootLeaves;

import algorithms.src.Common.TreeNode;

public class ValidSequenceRootLeaves {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return helper(root, arr, 0);
    }

    public boolean helper(TreeNode root, int[] arr, int level) {
        if (level >= arr.length) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return level == arr.length - 1 && root.val == arr[level];
        }

        if (root.right == null) {
            return root.val == arr[level] && helper(root.left, arr, level + 1);
        }

        if (root.left == null) {
            return root.val == arr[level] && helper(root.right, arr, level + 1);
        }

        return root.val == arr[level] &&
                (helper(root.left, arr, level + 1) || helper(root.right, arr, level + 1));
    }
}
