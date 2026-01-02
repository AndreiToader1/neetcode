package bitmanipulation.singlenumber;

public class Solution {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int index = 1; index < nums.length; index++) {
            result = result ^ nums[index];
        }

        return result;
    }
}
