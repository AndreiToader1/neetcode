package bitmanipulation.numberofonebits;

public class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        for (int bitmask = 0; bitmask < 32; bitmask++) {
            if (((1 << bitmask) & n) != 0) {
                result++;
            }
        }

        return result;
    }
}
