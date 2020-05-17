package algorithms.src.BitwiseNumbersRange;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitwiseNumbersRangeTest {
    @Test
    public void rangeBitwiseAnd() {
        BitwiseNumbersRange bitwiseNumbersRange = new BitwiseNumbersRange();
        assertEquals(3, bitwiseNumbersRange.rangeBitwiseAnd(5, 10));
    }
}
