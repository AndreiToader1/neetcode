package arraysandhashing.validanagram;

import java.util.HashMap;
import java.util.Objects;

public class Solution {
    public boolean isAnagram(String s, String t) {
        var firstStringOccurrences = ComputeCharsOccurrences(s);
        var secondStringOccurrences = ComputeCharsOccurrences(t);

        if (firstStringOccurrences.size() != secondStringOccurrences.size()) {
            return false;
        }

        for (var occurrenceKey: firstStringOccurrences.keySet()) {
            var firstStringOccurrence = firstStringOccurrences.get(occurrenceKey);
            var secondStringOccurrence = secondStringOccurrences.get(occurrenceKey);

            if (!Objects.equals(firstStringOccurrence, secondStringOccurrence)) {
                return false;
            }
        }

        return true;
    }

    private static HashMap<Character, Integer> ComputeCharsOccurrences(String input) {
        var result = new HashMap<Character, Integer>();
        for (var index = 0; index < input.length(); index++) {
            var currentChar = input.charAt(index);
            if (result.containsKey(currentChar)) {
                result.compute(currentChar, (k, currentCharOccurrence) -> currentCharOccurrence + 1);
            }
            else {
                result.put(currentChar, 1);
            }
        }

        return result;
    }
}
