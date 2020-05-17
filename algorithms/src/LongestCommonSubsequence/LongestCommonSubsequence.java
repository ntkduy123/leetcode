package algorithms.src.LongestCommonSubsequence;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] cache = new int[text1.length()][text2.length()];
        cache[0][0] = text1.charAt(0) == text2.charAt(0) ? 1 : 0;
        for (int i = 1; i < text1.length(); i++) {
            if (text1.charAt(i) == text2.charAt(0)) {
                cache[i][0] = 1;
            } else {
                cache[i][0] = cache[i - 1][0];
            }
        }

        for (int j = 1; j < text2.length(); j++) {
            if (text1.charAt(0) == text2.charAt(j)) {
                cache[0][j] = 1;
            } else {
                cache[0][j] = cache[0][j - 1];
            }
        }

        for (int i = 1; i < text1.length(); i++) {
            for (int j = 1; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    cache[i][j] = cache[i - 1][j - 1] + 1;
                } else {
                    cache[i][j] = Math.max(cache[i - 1][j], cache[i][j - 1]);
                }
            }
        }

        return cache[text1.length() - 1][text2.length() - 1];
    }
}
