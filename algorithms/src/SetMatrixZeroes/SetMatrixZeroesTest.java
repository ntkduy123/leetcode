package algorithms.src.SetMatrixZeroes;

import org.junit.Test;

public class SetMatrixZeroesTest {
    @Test
    public void setZeroes() {
        SetMatrixZeroes matrixZeroes = new SetMatrixZeroes();
        matrixZeroes.setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
}
