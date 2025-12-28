package reverselinkedlist;

import utils.linkedlist.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prevNode = null;
       ListNode currentNode = head;
       while (currentNode != null) {
           ListNode nextNode = currentNode.next;
           currentNode.next = prevNode;

           prevNode = currentNode;
           currentNode = nextNode;
       }

       return prevNode;
    }
}
