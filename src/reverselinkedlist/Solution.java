package reverselinkedlist;

import utils.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head.next;
        ListNode previousNode = head;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return currentNode;
    }
}
