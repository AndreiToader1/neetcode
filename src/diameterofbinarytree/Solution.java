package diameterofbinarytree;

import utils.binarytrees.TreeNode;

public class Solution {
    private int diameter;

    public Solution() {
        diameter = 0;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxHeight(root);

        return diameter;
    }

    private int maxHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);
        int totalHeight = leftHeight + rightHeight;

        diameter = Math.max(diameter, totalHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
