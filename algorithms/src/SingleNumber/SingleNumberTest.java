package algorithms.src.SingleNumber;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SingleNumberTest {

    @Test
    public void singleNumberTest() {
        SingleNumber singleNumber = new SingleNumber();
        assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));

        assertEquals(4, singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
