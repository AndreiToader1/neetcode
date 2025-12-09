package TwoSum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbersPositions = new HashMap<>();
        var resultStartIndex = -1;
        var resultEndIndex = -1;
        for (var currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            var currentNumber = nums[currentIndex];

            var candidateResponsePair = target - currentNumber;
            var candidateResponseIndex = numbersPositions.get(candidateResponsePair);
            if (candidateResponseIndex != null) {
                resultStartIndex = candidateResponseIndex;
                resultEndIndex = currentIndex;
                break;
            }

            numbersPositions.put(currentNumber, currentIndex);
        }

        return new int[] {resultStartIndex, resultEndIndex};
    }
}
