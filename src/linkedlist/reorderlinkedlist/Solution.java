package linkedlist.reorderlinkedlist;

import utils.linkedlist.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        ListNode middleNode = getMiddleNode(head);
        ListNode tail = revertSecondHalf(middleNode);

        ListNode firstHalfNode = head;
        ListNode secondHalfNode = tail;
        ListNode currentNode  = head;
        while (secondHalfNode != null) {
            currentNode.next = secondHalfNode;
            currentNode = currentNode.next;
            currentNode.next = firstHalfNode.next;
            currentNode = currentNode.next;
            firstHalfNode = firstHalfNode.next;
            secondHalfNode = secondHalfNode.next;
        }
    }

    private ListNode getMiddleNode(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
            if (fastPointer != null) {
                fastPointer = fastPointer.next;
            }
        }
        return slowPointer;
    }

    private ListNode revertSecondHalf(ListNode middleNode) {
        ListNode prevNode = null;
        ListNode currentNode = middleNode;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextNode;
        }

        return prevNode;
    }
}
