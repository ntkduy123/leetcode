package algorithms.src.MaximumSideLength;

public class MaximumSideLength {
    public static int maxSideLength(int[][] mat, int threshold) {
        int matHeight = mat.length;
        int matWidth = mat[0].length;

        int squareSize = matHeight < matWidth ? matHeight : matWidth;

        loop:
        while (squareSize >= 0) {
            for (int r = squareSize - 1; r < matHeight; r++) {
                for (int c = squareSize - 1; c < matWidth; c++) {
                    int squareSum = 0;
                    for (int i = r + 1 - squareSize; i <= r; i++) {
                        for (int j = c + 1 - squareSize; j <= c; j++) {
                            squareSum += mat[i][j];
                        }
                    }

                    if (squareSum <= threshold) {
                        break loop;
                    }
                }
            }
            squareSize--;
        }

        return squareSize;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,1,3,2,4,3,2},{1,1,3,2,4,3,2},{1,1,3,2,4,3,2}};
        System.out.println(maxSideLength(mat, 4));
    }
}
