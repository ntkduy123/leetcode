package algorithms.src.SearchBST;

import algorithms.src.Common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchBSTTest {
    @Test
    public void searchBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        SearchBST searchBST = new SearchBST();
        assertEquals(root.left, searchBST.searchBST(root, 2));
    }
}
