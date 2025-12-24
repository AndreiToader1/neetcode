import longestconsecutivesequence.Solution;


public class Main {
    public static void main(String[] args) {
        var nums = new int[] {0,3,2,5,4,6,1,1};
        var solution = new Solution();
        var result = solution.longestConsecutive(nums);
        System.out.print(result);
    }
}