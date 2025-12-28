package combinationsum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final int MAX_NUMBER_OF_POSITIONS = 35;
    private static final int FIRST_INVALID_VALUE = -1;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int[] sumPositions = new int[MAX_NUMBER_OF_POSITIONS];
        int[] partialSum = new int[MAX_NUMBER_OF_POSITIONS];
        int k = 0;
        sumPositions[0] = FIRST_INVALID_VALUE;
        while (k > FIRST_INVALID_VALUE) {
            if (sumPositions[k] < nums.length - 1) {
                sumPositions[k]++;
                partialSum[k] = getCurrentPartialSum(partialSum, k, nums[sumPositions[k]]);
                if (isPartialSolution(partialSum,k, target)) {
                    if (isFinalSolution(partialSum, k, target)) {
                        result.add(getCurrentSolution(nums, sumPositions,k));
                    }
                    else {
                        k++;
                        sumPositions[k] = sumPositions[k-1]-1;
                    }
                }
            }
            else {
                k--;
            }
        }

        return result;
    }

    private static int getCurrentPartialSum(int[] partialSum, int k, int value) {
        if (k == 0) {
            return value;
        }

        return partialSum[k-1]+ value;
    }

    private static List<Integer> getCurrentSolution(int[] nums, int[] sumPositions, int k) {
        List<Integer> result = new ArrayList<>();
        for (int index = 0; index <= k; index ++) {
            result.add(nums[sumPositions[index]]);
        }

        return result;
    }

    private static boolean isPartialSolution(int[] partialSum, int k, int target) {
        return partialSum[k] <= target;
    }

    private static boolean isFinalSolution(int[] partialSum, int k, int target) {
        return partialSum[k] == target;
    }
}
