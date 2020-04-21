package algorithms.src.HappyNumber;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HappyNumberTest {
    @Test
    public void isHappyTest() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappy(3284));
    }
}
