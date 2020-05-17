package algorithms.src.LRUCache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class LRUCache {

    private int capacity;

    private int cacheSize;

    private Node head = null;

    private Node tail = null;

    private Map<Integer, Node> cache = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        this.head.next = tail;
        this.tail.pre = head;
        this.head.pre = null;
        this.tail.next = null;
        this.cacheSize = 0;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        Node node = cache.get(key);
        int result = node.value;
        this.remove(node);
        this.add(node);
        return result;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            this.remove(node);
            this.add(node);
        } else {
            Node node = new Node(key, value);
            cache.put(key, node);
            if (cacheSize < capacity) {
                cacheSize++;
                this.add(node);
            } else {
                cache.remove(tail.pre.key);
                this.remove(tail.pre);
                this.add(node);
            }
        }
    }

    public void add(Node node) {
        node.next = head.next;
        node.next.pre = node;
        node.pre = head;
        head.next = node;
    }

    public void remove(Node node) {
        node.next.pre = node.pre;
        node.pre.next = node.next;
    }

    public class Node {
        private int value;
        private int key;
        private Node next;
        private Node pre;

        public Node(int key, int value) {
            this.value = value;
            this.key = key;
        }
    }
}