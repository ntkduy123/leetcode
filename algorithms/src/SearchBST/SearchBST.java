package algorithms.src.SearchBST;

import algorithms.src.Common.TreeNode;

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        if (val > root.val) {
            return searchBST(root.right, val);
        }

        return searchBST(root.left, val);
    }
}
