import combinationsum.Solution;


public class Main {
    public static void main(String[] args) {
        var nums = new int[] {3};

        var solution = new Solution();
        var result = solution.combinationSum(nums, 5);
        System.out.print(result.toString());
    }
}