import twosumsortedarray.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var result = solution.twoSum(new int[] {-10,-5,0,3,7}, -2);
        for (var index: result) {
            System.out.println(index);
        }
    }
}