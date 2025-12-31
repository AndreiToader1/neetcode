import diameterofbinarytree.Solution;
import utils.binarytrees.BinaryTreesUtils;


public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var values = new Integer[] {1,null, 2,3,4,5};
        var rootNode = BinaryTreesUtils.constructBinaryTree(values);
        int treeDiameter = solution.diameterOfBinaryTree(rootNode);
        System.out.println(treeDiameter);
    }
}