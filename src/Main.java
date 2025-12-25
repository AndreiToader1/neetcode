import containerwithmostwater.Solution;


public class Main {
    public static void main(String[] args) {
        var heights = new int[] {2,2,2};
        var solution = new Solution();
        var result = solution.maxArea(heights);
        System.out.print(result);
    }
}