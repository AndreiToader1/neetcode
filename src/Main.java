import linkedlist.mergetwosortedlists.Solution;
import utils.linkedlist.ListNodeUtils;


public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var firstListValues = new int[]{};
        var secondListValues = new int[] {1,3,5};

        var firstListHead = ListNodeUtils.createSingleLinkedList(firstListValues);
        var secondListHead = ListNodeUtils.createSingleLinkedList(secondListValues);
        var sortedListHead = solution.mergeTwoLists(firstListHead, secondListHead);
        var sortedList = ListNodeUtils.getSingleLinkedListValues(sortedListHead);
        System.out.println(sortedList);
    }
}