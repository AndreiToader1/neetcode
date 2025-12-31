import balancedbinarytree.Solution;
import utils.binarytrees.BinaryTreesUtils;


public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var values = new Integer[]{};
        var rootNode = BinaryTreesUtils.constructBinaryTree(values);
        boolean isBalanced = solution.isBalanced(rootNode);
        System.out.println(isBalanced);
    }
}