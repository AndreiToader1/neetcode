package binarysearch;

public class Solution {
    private static final int NOT_FOUND_INDEX = -1;
    public int search(int[] nums, int target) {
        int targetIndex = NOT_FOUND_INDEX;
        int leftIndex = 1;
        int rightIndex = nums.length;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) /2;
            int middleNumber = nums[middleIndex-1];
            if (middleNumber == target) {
                targetIndex = middleIndex-1;
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
