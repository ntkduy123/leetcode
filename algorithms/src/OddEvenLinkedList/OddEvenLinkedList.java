package algorithms.src.OddEvenLinkedList;

import algorithms.src.Common.ListNode;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        ListNode headEven = head.next;
        ListNode odd = head;
        ListNode even = headEven;
        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = even.next;
            even.next = odd.next;
            even = odd.next;
        }

        odd.next = headEven;
        return head;
    }
}
