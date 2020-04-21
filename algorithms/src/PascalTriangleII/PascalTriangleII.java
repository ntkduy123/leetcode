package algorithms.src.PascalTriangleII;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        int temp = 0;
        int temp2 = 0;
        int[] mem = new int[rowIndex + 1];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    mem[j] = 1;
                } else if (j == 1) {
                    temp = mem[j];
                    mem[j] = temp + mem[j - 1];
                } else {
                    temp2 = mem[j];
                    mem[j] = temp + mem[j];
                    temp = temp2;
                }

                if (i == rowIndex) {
                    result.add(mem[j]);
                }
            }
        }
        return result;
    }
}
