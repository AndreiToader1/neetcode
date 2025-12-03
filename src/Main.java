import ValidAnagram.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var s = "jap";
        var t = "ja";
        System.out.println(solution.isAnagram(s,t));
    }
}