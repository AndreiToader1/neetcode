package linkedlist.mergetwosortedlists;

import utils.linkedlist.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 != null && list2 == null) {
            return list1;
        }

        if (list1 == null) {
            return list2;
        }
        ListNode headOfSortedList = null;
        ListNode sortedList = null;

        if (list1.val < list2.val) {
            headOfSortedList = list1;
            sortedList = list1;
            list1 = list1.next;
        }
        else {
            headOfSortedList= list2;
            sortedList = list2;
            list2 = list2.next;
        }

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                sortedList.next = list1;
                list1 = list1.next;

            }
            else {
                sortedList.next = list2;
                list2 = list2.next;
            }

            sortedList = sortedList.next;
        }

        while (list1 != null) {
            sortedList.next = list1;
            sortedList = sortedList.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            sortedList.next = list2;
            sortedList = sortedList.next;
            list2 = list2.next;
        }

        return headOfSortedList;
    }
}
