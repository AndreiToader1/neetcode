import subsets.Solution;


public class Main {
    public static void main(String[] args) {
        var nums = new int[] {7};

        var solution = new Solution();
        var result = solution.subsets(nums);
        System.out.print(result.toString());
    }
}