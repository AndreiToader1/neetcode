import GroupAnagrams.Solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var strs = new String[] {"bdddddddddd","bbbbbbbbbbc"};
        var result = solution.groupAnagrams(strs);
        for (var list: result) {
            for (var item: list) {
                System.out.print(item+ " ");
            }

            System.out.println("\n");
        }
    }
}