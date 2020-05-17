package algorithms.src.BinaryTreeMaximumPathSum;

import algorithms.src.Common.TreeNode;

public class BinaryTreeMaximumPathSum {
    private int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        depth(root);
        return result;
    }

    public int depth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        leftDepth = leftDepth < 0 ? 0 : leftDepth;
        rightDepth = rightDepth < 0 ? 0 : rightDepth;

        result = Math.max(result, leftDepth + rightDepth + root.val);

        return Math.max(leftDepth, rightDepth) + root.val;
    }
}
