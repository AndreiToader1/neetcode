import threesum.Solution;


public class Main {
    public static void main(String[] args) {
        var nums = new int[] {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        var solution = new Solution();
        var result = solution.threeSum(nums);
        System.out.print(result.toString());
    }
}