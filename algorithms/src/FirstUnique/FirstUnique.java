package algorithms.src.FirstUnique;

import java.util.HashMap;
import java.util.Map;

public class FirstUnique {

    private Node head = null;

    private Node tail = null;

    private Map<Integer, Node> cache = new HashMap<>();

    public FirstUnique(int[] nums) {
        this.head = new Node(-1);
        this.tail = new Node(-1);
        this.head.next = tail;
        this.tail.pre = head;
        this.head.pre = null;
        this.tail.next = null;
        for (int num : nums) {
            this.add(num);
        }
    }

    public int showFirstUnique() {
        return head.next.value;
    }

    public void add(int value) {
        if (cache.containsKey(value)) {
            Node node = cache.get(value);
            if (node != null) {
                this.removeNode(node);
                cache.put(value, null);
            }
        } else {
            Node node = new Node(value);
            cache.put(value, node);
            this.addNode(node);
        }
    }

    public void addNode(Node node) {
        node.pre = tail.pre;
        node.pre.next = node;
        node.next = tail;
        tail.pre = node;
    }

    public void removeNode(Node node) {
        node.next.pre = node.pre;
        node.pre.next = node.next;
    }

    public class Node {
        private int value;
        private Node next;
        private Node pre;

        public Node(int value) {
            this.value = value;
        }
    }
}
