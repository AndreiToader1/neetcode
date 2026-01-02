import linkedlist.reorderlinkedlist.Solution;
import utils.linkedlist.ListNodeUtils;


public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var values = new int[] {1,2,3,4};
        var listHead = ListNodeUtils.createSingleLinkedList(values);
        solution.reorderList(listHead);
        var listValues = ListNodeUtils.getSingleLinkedListValues(listHead);
        System.out.println(listValues);
    }
}