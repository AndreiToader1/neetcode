package stack.reversepolishnotation;

import java.util.Stack;

public class Solution {
    private static final String ADD_OPERATOR = "+";
    private static final String DIFF_OPERATOR = "-";
    private static final String MULTIPLIER_OPERATOR = "*";
    private static final String DIVISION_OPERATOR = "/";
    private Stack<Integer> numbersStack;

    public Solution() {
        numbersStack = new Stack<>();
    }
    public int evalRPN(String[] tokens) {
        for (String token: tokens) {
            if (isOperator(token)) {
                int topStackValue = getAndPopLatestStackValue();
                int secondStackValue = getAndPopLatestStackValue();
                int expressionResult = computeExpressionValue(secondStackValue, topStackValue, token);
                numbersStack.push(expressionResult);
            }
            else {
                numbersStack.push(Integer.parseInt(token));
            }
        }
        return numbersStack.pop();
    }

    private static int computeExpressionValue(int firstValue, int secondValue, String operator) {
        if (operator.equals(ADD_OPERATOR)) {
            return firstValue + secondValue;
        }
        else if (operator.equals(DIFF_OPERATOR)) {
            return firstValue - secondValue;
        }
        else if (operator.equals(MULTIPLIER_OPERATOR)) {
            return firstValue * secondValue;
        }
        else if (operator.equals(DIVISION_OPERATOR)) {
            return firstValue/secondValue;
        }

        return 0;
    }

    private int getAndPopLatestStackValue() {
        if (numbersStack.isEmpty()) {
            return 0;
        }

        return numbersStack.pop();
    }
    private static boolean isOperator(String token) {
        return token.equals(ADD_OPERATOR) || token.equals(DIFF_OPERATOR) || token.equals(MULTIPLIER_OPERATOR) || token.equals(DIVISION_OPERATOR);
    }
}
