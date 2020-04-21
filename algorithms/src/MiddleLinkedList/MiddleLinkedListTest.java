package algorithms.src.MiddleLinkedList;

import algorithms.src.Common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleLinkedListTest {
    @Test
    public void middleNodeTest() {
        MiddleLinkedList middleLinkedList = new MiddleLinkedList();
        ListNode head = new ListNode(1);
        int arr[] = new int[]{1, 2, 3, 4, 5};
        ListNode cur = head;
        ListNode expected = head;
        for (int num : arr) {
            ListNode node = new ListNode(num);
            cur.next = node;
            cur = cur.next;
            if (cur.val == 3) {
                expected = cur;
            }
        }

        assertEquals(expected, middleLinkedList.middleNode(head));
    }
}
