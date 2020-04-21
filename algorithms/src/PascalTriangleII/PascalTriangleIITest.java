package algorithms.src.PascalTriangleII;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PascalTriangleIITest {
    @Test
    public void getRow() {
        PascalTriangleII pascalTriangleII = new PascalTriangleII();
        List<Integer> row = pascalTriangleII.getRow(8);
        int[] expected = new int[]{1, 3, 3, 1};
        assertArrayEquals(expected, row.stream().mapToInt(i -> i).toArray());
    }
}
