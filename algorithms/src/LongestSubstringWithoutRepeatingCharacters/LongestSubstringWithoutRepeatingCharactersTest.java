package algorithms.src.LongestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, test.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, test.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, test.lengthOfLongestSubstring("pwwkew"));
        assertEquals(3, test.lengthOfLongestSubstring("dvdf"));
        assertEquals(2, test.lengthOfLongestSubstring("abba"));
        assertEquals(1, test.lengthOfLongestSubstring(" "));
    }
}
