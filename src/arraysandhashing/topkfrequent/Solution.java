package arraysandhashing.topkfrequent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numbersFrequency = new HashMap<>();
        for (var currentNumber : nums) {
            numbersFrequency.merge(currentNumber, 1, Integer::sum);
        }

        var numbersByFrequency = getNumbersByFrequency(numbersFrequency, nums.length);

        return computeResult(numbersByFrequency, k);
    }

    private static int[] computeResult(List<List<Integer>> numbersByFrequency, int k) {
        var result = new ArrayList<Integer>();
        var currentFrequency = numbersByFrequency.size()-1;
        int addedNumbers = 0;
        while (addedNumbers < k) {
            var currentNumbers = numbersByFrequency.get(currentFrequency);
            if (!currentNumbers.isEmpty()) {
                result.addAll(currentNumbers.subList(0, Math.min(k - addedNumbers, currentNumbers.size())));
                addedNumbers += currentNumbers.size();
            }

            currentFrequency--;
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private static List<List<Integer>> getNumbersByFrequency(HashMap<Integer, Integer> numbersFrequency, int maxDistinctFrequencies) {
        List<List<Integer>> numbersByFrequency = getEmptyLists(maxDistinctFrequencies +1);
        for (var currentNumber : numbersFrequency.keySet()) {
            var currentNumberFrequency = numbersFrequency.get(currentNumber);

            var currentNumberList = numbersByFrequency.get(currentNumberFrequency);
            currentNumberList.add(currentNumber);
        }

        return numbersByFrequency;
    }

    private static List<List<Integer>> getEmptyLists(int capacity) {
        List<List<Integer>> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add(new ArrayList<>());
        }

        return result;
    }
}
