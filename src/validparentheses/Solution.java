package validparentheses;

import java.util.Stack;

public class Solution {
    private final Stack<Character> parentheses;
    private static final char NULL_CHAR = '\0';
    public Solution() {
        parentheses = new Stack<>();
    }
    public boolean isValid(String s)
    {
        var isValidParenthesis = true;
        for (int currentCharIndex = 0; currentCharIndex < s.length(); currentCharIndex++) {
            var currentChar = s.charAt(currentCharIndex);
            if (isOpeningParenthesis(currentChar)) {
                parentheses.push(currentChar);
            }
            else {
                if (parentheses.isEmpty()) {
                    isValidParenthesis = false;
                }
                else {
                    var topParenthesis = parentheses.pop();
                    var openingParenthesis = getOpeningParenthesis(currentChar);
                    isValidParenthesis = topParenthesis == openingParenthesis;
                }

                if (!isValidParenthesis) {
                    break;
                }
            }
        }

        return isValidParenthesis && parentheses.isEmpty();
    }

    private static char getOpeningParenthesis(Character c) {
        return switch (c) {
            case ')' -> '(';
            case ']' -> '[';
            case '}' -> '{';
            default -> NULL_CHAR;
        };

    }

    private static boolean isOpeningParenthesis(Character c) {
        return c == '(' || c == '[' || c == '{';
    }
}
