package binarysearch;

public class Solution {
    private static final int NOT_FOUND_INDEX = -1;
    public int search(int[] nums, int target) {
        int targetIndex = NOT_FOUND_INDEX;
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) /2;
            int middleNumber = nums[middleIndex];
            if (middleNumber == target) {
                targetIndex = middleIndex;
                break;
            }
            else if (middleNumber > target) {
                rightIndex = middleIndex-1;
            }
            else {
                leftIndex = middleIndex + 1;
            }
        }

        return targetIndex;
    }
}
