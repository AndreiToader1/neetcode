import invertbinarytree.Solution;
import utils.binarytrees.BinaryTreesUtils;
import utils.binarytrees.TreeNode;


public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var values = new int[] {3,2,1};
        var rootNode = BinaryTreesUtils.constructBinaryTree(values);
        TreeNode invertedTree = solution.invertTree(rootNode);

        var decodedValues = BinaryTreesUtils.getBinaryTreeValues(invertedTree);

        System.out.println(decodedValues);
    }
}