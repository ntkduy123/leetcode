package algorithms.src.GroupAnagrams;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> result = new HashMap<>();
        int[] chars = new int[26];
        for (String str : strs) {
            Arrays.fill(chars, 0);
            for (char c : str.toCharArray()) chars[c - 'a']++;

            String key = Arrays.toString(chars);
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(str);
        }
        return new ArrayList<>(result.values());
    }
}
