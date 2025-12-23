package encodedecodestring;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final char STRING_DELIMITER = '#';
    private static final String EMPTY_STRING = "";
    public String encode(List<String> strs) {
        var stringBuilder = new StringBuilder();
        for (var currentString: strs) {
            stringBuilder.append(currentString.length());
            stringBuilder.append(STRING_DELIMITER);
            stringBuilder.append(currentString);
        }

        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        var result = new ArrayList<String>();
        int currentIndex = 0;
        while (currentIndex < str.length()) {
            StringBuilder currentStringLength = new StringBuilder(EMPTY_STRING);
            while (str.charAt(currentIndex) != STRING_DELIMITER) {
                currentStringLength.append(str.charAt(currentIndex));
                currentIndex++;
            }

            int stringLength = Integer.parseInt(currentStringLength.toString());

            result.add(str.substring(currentIndex+1, currentIndex + stringLength+1));
            currentIndex += stringLength + 1;
        }

        return result;
    }
}
