import topkfrequent.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var nums = new int[] {7, 7};
        var k = 1;

        var result = solution.topKFrequent(nums, k);
        for (int j : result) {
            System.out.println(j);
        }
    }
}