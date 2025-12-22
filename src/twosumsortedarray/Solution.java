package twosumsortedarray;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftIndex = 0;
        int rightIndex = numbers.length-1;
        while (leftIndex < rightIndex) {
            var currentSum = numbers[leftIndex] + numbers[rightIndex];
            if (currentSum == target) {
                break;
            }

            if (currentSum < target) {
                leftIndex++;
            } else {
                rightIndex--;
            }

        }

        return new int[] {leftIndex+1, rightIndex+1};
    }
}
