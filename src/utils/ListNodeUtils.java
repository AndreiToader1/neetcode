package utils;

import java.util.ArrayList;
import java.util.List;

public  class ListNodeUtils {
    public static List<Integer> getSingleLinkedListValues(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }

        return result;
    }

    public static ListNode createSingleLinkedList(int[] nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode currentNode = head;
        for (int index = 1; index < nums.length; index++) {
            ListNode newNode = new ListNode(nums[index]);
            currentNode.next = newNode;
            currentNode = newNode;
        }

        return head;
    }
}
