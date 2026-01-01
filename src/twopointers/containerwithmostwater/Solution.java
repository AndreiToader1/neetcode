package twopointers.containerwithmostwater;

public class Solution {
    public int maxArea(int[] heights) {
        int leftIndex = 0;
        int rightIndex = heights.length-1;
        int maxWater = Integer.MIN_VALUE;
        while (leftIndex < rightIndex) {
            maxWater = Math.max(maxWater, getMaxWater(heights, leftIndex, rightIndex));
            if (heights[leftIndex] < heights[rightIndex]) {
                leftIndex++;
            }
            else {
                rightIndex--;
            }
        }

        return maxWater;
    }

    private static int getMaxWater(int[] heights, int leftIndex, int rightIndex) {
        return (rightIndex - leftIndex) * Math.min(heights[leftIndex], heights[rightIndex]);
    }
}
