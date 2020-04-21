package algorithms.src.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int maxSoFar = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) >= left) {
                    max = Math.max(max, maxSoFar);
                    maxSoFar = maxSoFar - (map.get(c) - left + 1);
                    left = map.get(c) + 1;
                }
            }
            map.put(c, i);
            maxSoFar++;
        }
        return Math.max(max, maxSoFar);
    }
}
