package utils.linkedlist;

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

    public static ListNode createSingleLinkedListWithCycle(int[] nums, int cycleIndex) {
        ListNode head = new ListNode(nums[0]);
        ListNode[] nodes = new ListNode[nums.length];
        ListNode currentNode = head;
        nodes[0] = head;
        for (int index = 1; index < nums.length; index++) {
            ListNode node = new ListNode(nums[index]);
            nodes[index] = node;
            currentNode.next = node;
            currentNode = node;
        }

        if (cycleIndex != -1) {
            currentNode.next = nodes[cycleIndex];
        }

        return head;
    }
}
