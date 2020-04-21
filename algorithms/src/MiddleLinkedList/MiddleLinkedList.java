package algorithms.src.MiddleLinkedList;

import algorithms.src.Common.ListNode;

public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }
}
