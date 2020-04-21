package algorithms.src.PerformStringShifts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PerformStringShiftsTest {
    @Test
    public void stringShift() {
        PerformStringShifts performStringShifts = new PerformStringShifts();
//        assertEquals("cab", performStringShifts.stringShift("abc", new int[][]{{0, 1} , {1,2}}));
//        assertEquals("efgabcd", performStringShifts.stringShift("abcdefg", new int[][]{{1,1} , {1,1}, {0,2}, {1,3}}));
        assertEquals("efgabcd", performStringShifts.stringShift("wpdhhcj", new int[][]{{0,7},{1,7},{1,0},{1,3},{0,3},{0,6},{1,2}}));
    }
}
