package algorithms.src.FloodFill;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Queue<int[]> queue = new LinkedList<>();
        int color = image[sr][sc];
        queue.add(new int[]{sr, sc});
        while (!queue.isEmpty()) {
            int[] pixel = queue.remove();
            int row = pixel[0];
            int col = pixel[1];
            if (row - 1 >= 0 && image[row - 1][col] == color && image[row - 1][col] != newColor) {
                queue.add(new int[]{row - 1, col});
                image[row - 1][col] = newColor;
            }

            if (col - 1 >= 0 && image[row][col - 1] == color && image[row][col - 1] != newColor) {
                queue.add(new int[]{row, col - 1});
                image[row][col - 1] = newColor;
            }

            if (row + 1 < image.length && image[row + 1][col] == color && image[row + 1][col] != newColor) {
                queue.add(new int[]{row + 1, col});
                image[row + 1][col] = newColor;
            }

            if (col + 1 < image[0].length && image[row][col + 1] == color && image[row][col + 1] != newColor) {
                queue.add(new int[]{row, col + 1});
                image[row][col + 1] = newColor;
            }
        }
        image[sr][sc] = newColor;

        return image;
    }
}
