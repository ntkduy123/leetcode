package algorithms.src.ReverseString;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {
    @Test
    public void reverseStringTest() {
        ReverseString reverseString = new ReverseString();
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString.reverseString(s);
        char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
        for (int i = 0; i < expected.length; i ++) {
            assertEquals(expected[i], s[i]);
        }
    }
}
