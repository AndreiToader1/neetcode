import reverselinkedlist.Solution;
import utils.linkedlist.ListNodeUtils;


public class Main {
    public static void main(String[] args) {
        var head = ListNodeUtils.createSingleLinkedList(new int[] {0,1,2,3});
        var solution = new Solution();
        var resultHeadNode = solution.reverseList(head);
        var resultAsList = ListNodeUtils.getSingleLinkedListValues(resultHeadNode);
        System.out.print(resultAsList);
    }
}