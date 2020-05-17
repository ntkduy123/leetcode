package algorithms.src.MaximalSquare;

import org.junit.Test;

public class MaximalSquareTest {
    @Test
    public void maximalSquare() {
        MaximalSquare maximalSquare = new MaximalSquare();
        char[][] matrix = new char[][]{
                {'1','1','1','1','0'},
                {'1','0','0','0','0'},
                {'1','0','0','0','0'},
                {'1','0','0','0','0'}
        };
        System.out.println(maximalSquare.maximalSquare(matrix));
    }
}
