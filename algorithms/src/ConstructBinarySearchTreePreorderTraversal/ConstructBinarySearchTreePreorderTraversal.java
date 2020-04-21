package algorithms.src.ConstructBinarySearchTreePreorderTraversal;

import algorithms.src.Common.TreeNode;

public class ConstructBinarySearchTreePreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            insert(root, preorder[i]);
        }

        return root;
    }

    public void insert(TreeNode root, int val) {
        if (val > root.val) {
            if (root.right != null) {
                insert(root.right, val);
            } else {
                root.right = new TreeNode(val);
            }
        } else {
            if (root.left != null) {
                insert(root.left, val);
            } else {
                root.left = new TreeNode(val);
            }
        }
    }
}
