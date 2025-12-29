package utils.binarytrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreesUtils {
    public static TreeNode constructBinaryTree(int[] values) {
        var root = new TreeNode(values[0]);
        int valueIndex = 1;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);

        while (valueIndex < values.length) {
            TreeNode currentNode = nodes.poll();
            TreeNode leftNode = new TreeNode(values[valueIndex]);
            currentNode.left = leftNode;
            nodes.offer(leftNode);

            valueIndex++;
            if (valueIndex < values.length) {
                TreeNode rightNode = new TreeNode(values[valueIndex]);
                currentNode.right = rightNode;
                nodes.offer(rightNode);
                valueIndex++;
            }

        }

        return root;
    }

    public static List<Integer> getBinaryTreeValues(TreeNode rootNode) {
        List<Integer> values = new ArrayList<>();
        values.add(rootNode.val);
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(rootNode);

        while (!nodes.isEmpty()) {
            TreeNode currentNode = nodes.poll();
            if (currentNode.left != null) {
                values.add(currentNode.left.val);
                nodes.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                values.add(currentNode.right.val);
                nodes.offer(currentNode.right);
            }
        }

        return values;
    }
}
