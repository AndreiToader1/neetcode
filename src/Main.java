import maximumdepthbinarytree.Solution;
import utils.binarytrees.BinaryTreesUtils;
import utils.binarytrees.TreeNode;


public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var values = new Integer[] {3,2,1};
        var rootNode = BinaryTreesUtils.constructBinaryTree(values);
        int maxDepth = solution.maxDepth(rootNode);
        System.out.println(maxDepth);
    }
}