package algorithms.src.ImplementTrie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if (!node.links.containsKey(c)) {
                node.links.put(c, new TrieNode());
            }
            node = node.links.get(c);
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if (node.links.containsKey(c)) {
                node = node.links.get(c);
            } else {
                return false;
            }
        }

        return node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            Character c = prefix.charAt(i);
            if (node.links.containsKey(c)) {
                node = node.links.get(c);
            } else {
                return false;
            }
        }

        return true;
    }
}

class TrieNode {
    public Map<Character, TrieNode> links;

    public boolean isEnd;

    public TrieNode() {
        links = new HashMap<>();
    }
}