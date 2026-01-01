package backtracking.subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final int INVALID_SUBSET_INDEX = -1;
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        int subsetsCount = 0;
        int[] subsetsIndexes = new int[nums.length+1];
        subsetsIndexes[subsetsCount] = INVALID_SUBSET_INDEX;
        while (subsetsCount > INVALID_SUBSET_INDEX) {
            if (subsetsIndexes[subsetsCount] < nums.length-1) {
                subsetsIndexes[subsetsCount]++;
                result.add(getCurrentSolution(nums, subsetsIndexes, subsetsCount));

                subsetsCount++;
                subsetsIndexes[subsetsCount] = subsetsIndexes[subsetsCount-1];

            }
            else {
                subsetsCount--;
            }
        }
        return result;
    }

    private static List<Integer> getCurrentSolution(int[] nums, int[] subsetIndexes, int subsetsCount) {
        List<Integer> result = new ArrayList<>();
        for (int index= 0 ; index < subsetsCount+1; index++) {
            result.add(nums[subsetIndexes[index]]);
        }

        return result;
    }
}
