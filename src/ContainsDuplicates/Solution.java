package ContainsDuplicates;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

public class Solution {
    private Dictionary<Integer, Boolean> containsDuplicates = new Hashtable<>();
    public boolean hasDuplicate(int[] nums) {
        for (int number: nums) {
            var isDuplicate = containsDuplicates.get(number);
            if (isDuplicate != null && isDuplicate) {
                return true;
            }

            containsDuplicates.put(number, true);
        }

        return false;
    }
}
