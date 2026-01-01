package twopointers.validpalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        int leftIndex = 0;
        int rightIndex = s.length()-1;
        boolean result = true;
        while (leftIndex < rightIndex) {
            while (!Character.isLetterOrDigit(s.charAt(leftIndex)) && leftIndex < rightIndex)
            {
                leftIndex++;
            }

            while (!Character.isLetterOrDigit(s.charAt(rightIndex)) && leftIndex < rightIndex) {
                rightIndex--;
            }

            if (Character.toLowerCase(s.charAt(leftIndex)) != Character.toLowerCase(s.charAt(rightIndex))) {
                result = false;
                break;
            }

            leftIndex++;
            rightIndex--;
        }

        return result;
    }
}