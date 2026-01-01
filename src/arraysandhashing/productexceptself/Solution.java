package arraysandhashing.productexceptself;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int nonZeroProduct = 1;
        int numberOfZeroes = 0;
        for (var currentNumber: nums) {
            if (currentNumber != 0) {
                nonZeroProduct *= currentNumber;
            }
            else {
                numberOfZeroes++;
            }
        }

        int[] result = new int[nums.length];
        for (var currentNumberIndex = 0; currentNumberIndex < nums.length; currentNumberIndex ++) {
            var numberOfZeroesExceptSelf = nums[currentNumberIndex] == 0? numberOfZeroes - 1 : numberOfZeroes;
            if (numberOfZeroesExceptSelf > 0) {
                result[currentNumberIndex] = 0;
            }
            else if (nums[currentNumberIndex] == 0) {
                result[currentNumberIndex] = nonZeroProduct;
            }
            else {
                result[currentNumberIndex] = nonZeroProduct/nums[currentNumberIndex];
            }
        }
        return result;
    }
}
