package algorithms.src.LongestPalindromicSubstring;

class LongestPalindromicSubstring {
    public String longestPalindromicSubstring(String s) {
        int start = 0, end = 0;
        if (s.isEmpty()) return s;
        for (int i = 0; i < s.length(); i++) {
            int palindromicSubstringLength = expand(s, i);

            if (palindromicSubstringLength > end - start + 1) {
                start = i - (palindromicSubstringLength - 1) / 2;
                end = i + palindromicSubstringLength / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public int expand(String s, int position) {
        int a = position - 1, b = position + 1, c = position, d = position + 1;
        while (a >= 0 && b <= s.length() - 1 && s.charAt(a) == s.charAt(b)) {
            a--;
            b++;
        }

        while (c >= 0 && d <= s.length() - 1 && s.charAt(c) == s.charAt(d)) {
            c--;
            d++;
        }

        return (b - a > d - c) ? b - a - 1 : d - c -1;
    }
}
