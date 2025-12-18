import ValidParentheses.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var parentheses = "[";
        var result = solution.isValid(parentheses);
        System.out.println(result);
    }
}