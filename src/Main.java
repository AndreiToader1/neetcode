import trees.samebinarysearchtree.Solution;
import utils.binarytrees.BinaryTreesUtils;


public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var firstTreeValues = new Integer[]{1,2,3};
        var secondTreeValues = new Integer[] {1,3,2};

        var firstTreeRoot = BinaryTreesUtils.constructBinaryTree(firstTreeValues);
        var secondTreeRoot = BinaryTreesUtils.constructBinaryTree(secondTreeValues);
        boolean isSameTree = solution.isSameTree(firstTreeRoot, secondTreeRoot);
        System.out.println(isSameTree);
    }
}