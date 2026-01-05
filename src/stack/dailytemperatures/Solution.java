package stack.dailytemperatures;

import java.util.Stack;

public class Solution {

    private Stack<Integer> decreasingMonotonicStack;

    public Solution() {
        decreasingMonotonicStack = new Stack<>();
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int index = temperatures.length-1; index>=0; index--) {
            int numberOfDays = 0;
            while (!decreasingMonotonicStack.isEmpty() && decreasingMonotonicStack.peek() < temperatures[index]) {
                numberOfDays++;
                decreasingMonotonicStack.pop();
            }

            result[index] = numberOfDays;

            decreasingMonotonicStack.push(temperatures[index]);
        }

        return result;
    }
}
