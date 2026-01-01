package linkedlist.linkedlistcycledetection;

import utils.linkedlist.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        while (slowPointer != null && slowPointer != fastPointer) {
            slowPointer = slowPointer.next;
            if (fastPointer != null) {
                fastPointer = fastPointer.next;
            }

            if (fastPointer != null) {
                fastPointer = fastPointer.next;
            }
        }

        return slowPointer != null;
    }
}
