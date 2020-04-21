package algorithms.src.Pow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowTest {
    @Test
    public void myPow() {
        Pow pow = new Pow();
        System.out.println(pow.myPow(2.00000, 10));
        assertEquals(1024.00000, pow.myPow(2.00000, 10), 1);
        assertEquals(9.26100, pow.myPow(2.10000, 3), 0);
        assertEquals(0.25000, pow.myPow(2.00000, -2), 0);
    }
}
