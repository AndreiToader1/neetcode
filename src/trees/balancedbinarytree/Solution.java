package trees.balancedbinarytree;

import utils.binarytrees.TreeNode;

public class Solution {
    private boolean balanced;

    public Solution() {
        balanced = true;
    }
    public boolean isBalanced(TreeNode root) {
        treeHeight(root);
        return balanced;
    }

    private int treeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);

        if (Math.abs(leftHeight- rightHeight) > 1) {
            balanced= false;
        }

        return 1+ Math.max(leftHeight, rightHeight);
    }
}
