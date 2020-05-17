package algorithms.src.MaximalSquare;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int max = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] cache = new int[row + 1][col + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    cache[i][j] = Math.min(Math.min(cache[i - 1][j], cache[i][j - 1]), cache[i - 1][j - 1]);
                    max = Math.max(max, cache[i][j]);
                }
            }
        }
        return max * max;
    }
}
