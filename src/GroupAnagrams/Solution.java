package GroupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private HashMap<String, List<String>> groupedAnagrams;
    private static final int NUMBER_OF_ALPHABET_LETTERS = 26;
    private static final char FIRST_LOWERCASE_ALPHABET_LETTER = 'a';
    private static final String EMPTY_STRING = "";
    public Solution() {
        groupedAnagrams = new HashMap<>();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        for (var str: strs) {
            var currentStringFrequency = computeStringFrequencyArray(str);
            var currentStringHashKey = computeHasKey(currentStringFrequency);
            addStringToHashKey(str, currentStringHashKey);
        }

        return new ArrayList<>(groupedAnagrams.values());
    }

    private void addStringToHashKey(String stringToAdd, String hashKey) {
        var anagramsGroup = groupedAnagrams.get(hashKey);
        if (anagramsGroup != null) {
            anagramsGroup.add(stringToAdd);
        }
        else {
            anagramsGroup = new ArrayList<>();
            anagramsGroup.add(stringToAdd);
        }

        groupedAnagrams.put(hashKey, anagramsGroup);
    }

    private static String computeHasKey(int[] frequencyArray) {
        StringBuilder resultKey = new StringBuilder(EMPTY_STRING);
        for (int letterIndex = 0; letterIndex < NUMBER_OF_ALPHABET_LETTERS; letterIndex++) {
            resultKey.append(frequencyArray[letterIndex]);
            resultKey.append("_");
        }

        return resultKey.toString();
    }

    private static int[] computeStringFrequencyArray(String str) {
        int[] frequencyArray = new int[NUMBER_OF_ALPHABET_LETTERS];
        for (var currentCharIndex = 0; currentCharIndex < str.length(); currentCharIndex ++) {
            var currentChar = str.charAt(currentCharIndex);
            frequencyArray[currentChar - FIRST_LOWERCASE_ALPHABET_LETTER]  += 1;
        }

        return frequencyArray;
    }
}
