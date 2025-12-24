package longestconsecutivesequence;

import java.util.HashSet;

public class Solution {
    private HashSet<Integer> numsSet;

    public Solution() {
        numsSet = new HashSet<>();
    }
    public int longestConsecutive(int[] nums) {
        for (var number: nums) {
            numsSet.add(number);
        }

        int longestConsecutiveSequence = 0;
        for (var number: numsSet) {
            if (!numsSet.contains(number-1)) {
                int length =1;
                while (numsSet.contains(number + length)) {
                    length ++;
                }

                if (length > longestConsecutiveSequence) {
                    longestConsecutiveSequence = length;
                }
            }
        }

        return longestConsecutiveSequence;
    }
}
