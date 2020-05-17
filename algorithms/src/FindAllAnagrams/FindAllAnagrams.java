package algorithms.src.FindAllAnagrams;

import java.util.*;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<>();
        int[] chars = new int[26];
        for (int i = 0; i < p.length(); i++) {
            int c = p.charAt(i) - 'a';
            chars[c]++;
        }

        int left = 0;
        int right = 0;
        int count = 0;
        while (right < s.length()) {
            int c = s.charAt(right) - 'a';
            if (chars[c] >= 1) {
                chars[c]--;
                right++;
            }

            if (count == 0) result.add(left);

            if (right - left == p.length()) {
                if (chars[s.charAt(left) - 'a'] >= 0) {
                    count++;
                }
                left++;
            }
        }

        return result;
    }
}
