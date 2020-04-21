package algorithms.src.DiameterBinaryTree;

import algorithms.src.Common.TreeNode;

public class DiameterBinaryTree {
    private int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return result;
    }

    public int depth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);

        result = Math.max(result, leftDepth + rightDepth);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
