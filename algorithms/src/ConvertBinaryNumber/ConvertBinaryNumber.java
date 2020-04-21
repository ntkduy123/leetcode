package algorithms.src.ConvertBinaryNumber;

public class ConvertBinaryNumber {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static int getDecimalValue(ListNode head) {
        StringBuilder binary = new StringBuilder();
        while (head != null) {
            binary.append(head.val);
            head = head.next;
        }

        return Integer.parseInt(binary.toString(), 2);
    }

    public static void main(String[] args) {
        ListNode x1 = new ListNode(1);
        ListNode x2 = new ListNode(1);
        ListNode x3 = new ListNode(1);
        ListNode x4 = new ListNode(1);
    }

}
