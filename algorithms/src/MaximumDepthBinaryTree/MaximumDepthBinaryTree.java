package algorithms.src.MaximumDepthBinaryTree;

import algorithms.src.Common.TreeNode;

public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return rightDepth > leftDepth ? rightDepth + 1 : leftDepth + 1;
    }
}
