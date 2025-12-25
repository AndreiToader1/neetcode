import reversepolishnotation.Solution;


public class Main {
    public static void main(String[] args) {
       var tokens = new String[] {"1","2","+","3","*","4","-"};
        var solution = new Solution();
        var result = solution.evalRPN(tokens);
        System.out.print(result);
    }
}