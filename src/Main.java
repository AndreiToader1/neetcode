import bitmanipulation.singlenumber.Solution;
import utils.linkedlist.ListNodeUtils;


public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var values = new int[] {7,6,6,7,8};
        var number = solution.singleNumber(values);
        System.out.println(number);
    }
}