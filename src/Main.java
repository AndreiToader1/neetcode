import productexceptself.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var nums = new int[] {-1,0,1,2,3};
        var k = 1;

        var result = solution.productExceptSelf(nums);
        for (int j : result) {
            System.out.println(j);
        }
    }
}