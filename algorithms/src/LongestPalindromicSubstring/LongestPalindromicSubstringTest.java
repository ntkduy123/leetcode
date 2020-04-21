package algorithms.src.LongestPalindromicSubstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringTest {

    @Test
    public void testLongestPalindromicSubstring() {
        String s1 = "babad";
        String s2 = "cbbd";
        String s3 = "ac";

        LongestPalindromicSubstring palindromicSubstring = new LongestPalindromicSubstring();

        String result1 = palindromicSubstring.longestPalindromicSubstring(s1);
        String result2 = palindromicSubstring.longestPalindromicSubstring(s2);
        String result3 = palindromicSubstring.longestPalindromicSubstring(s3);

        assertEquals("bab", result1);
        assertEquals("bb", result2);
        assertEquals("a", result3);
    }
}
