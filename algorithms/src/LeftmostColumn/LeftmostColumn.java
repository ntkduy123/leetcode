package algorithms.src.LeftmostColumn;

public class LeftmostColumn {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int row = binaryMatrix.dimensions().get(0);
        int col = binaryMatrix.dimensions().get(1);
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0) {
            if (binaryMatrix.get(i, j) == 1) {
                j--;
            } else {
                i++;
            }
        }

        if (i > row && j == col - 1) return -1;
        return j + 1;
    }
}
