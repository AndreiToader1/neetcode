import encodedecodestring.Solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<>(Arrays.asList("we","say",":","yes"));
        var solution = new Solution();
        var encodedResult = solution.encode(list);
        var decodedResult = solution.decode(encodedResult);
        for (var result: decodedResult) {
            System.out.println(result);
        }
    }
}