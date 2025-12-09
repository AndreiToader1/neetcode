import TwoSum.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var nums = new int[] {5,5};
        var target = 10;

        var result = solution.twoSum(nums, target);
        for (var number: result) {
            System.out.println(number);
        }
    }
}