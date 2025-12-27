package permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final int INVALID_PERMUTATION_INDEX = -1;
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int k = 0;
        int[] permutations = new int[nums.length+1];
        permutations[k] = INVALID_PERMUTATION_INDEX;
        while (k > INVALID_PERMUTATION_INDEX) {
            if (permutations[k] < nums.length-1) {
                permutations[k] ++;
                if (isPartialSolution(permutations, k)) {
                    if (isFinalSolution(nums, k)) {
                        result.add(getCurrentSolution(nums, permutations,k));
                    }
                    else {
                        k++;
                        permutations[k] = INVALID_PERMUTATION_INDEX;
                    }
                }
            }
            else {
                k--;
            }
        }
        return result;
    }

    private static List<Integer> getCurrentSolution(int[] nums, int[] permtuations, int k) {
        List<Integer> result = new ArrayList<>();
        for (int index = 0; index <=k; index++) {
            result.add(nums[permtuations[index]]);
        }

        return result;
    }

    private static boolean isPartialSolution(int[] permutations, int k) {
        for (int i = 0; i <= k; i++) {
            for (int j = i+1; j <=k; j++) {
                if (permutations[i] == permutations[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isFinalSolution(int[] nums, int k) {
        return nums.length == k+1;
    }
}
