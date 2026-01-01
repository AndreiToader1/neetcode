import linkedlist.linkedlistcycledetection.Solution;
import utils.linkedlist.ListNodeUtils;


public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var values = new int[] {1,2,3,4};
        var listHead = ListNodeUtils.createSingleLinkedListWithCycle(values, -1);
        var hasCycle = solution.hasCycle(listHead);
        System.out.println(hasCycle);
    }
}