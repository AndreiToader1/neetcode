import permutations.Solution;


public class Main {
    public static void main(String[] args) {
        var nums = new int[] {1,2,3};

        var solution = new Solution();
        var result = solution.permute(nums);
        System.out.print(result.toString());
    }
}