package twopointers.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (var leftIndex = 0; leftIndex < nums.length-2; leftIndex++) {
            if (leftIndex > 0 && nums[leftIndex] == nums[leftIndex-1]) {
                continue;
            }

            int remainingSumToZero = - nums[leftIndex];
            int middleIndex = leftIndex+1;
            int rightIndex = nums.length-1;
            while (middleIndex < rightIndex) {
                var currentSum = nums[middleIndex] + nums[rightIndex];
                if (currentSum == remainingSumToZero) {
                    result.add(Arrays.asList(nums[leftIndex], nums[middleIndex], nums[rightIndex]));
                    while (middleIndex + 1 < rightIndex && nums[middleIndex] == nums[middleIndex + 1]) middleIndex++;
                    while (rightIndex - 1 > middleIndex && nums[rightIndex] == nums[rightIndex - 1]) rightIndex--;
                    middleIndex++;
                    rightIndex--;
                }
                else if (currentSum > remainingSumToZero) {
                    rightIndex--;
                }
                else {
                    middleIndex++;
                }
            }
        }


        return result;
    }
}
