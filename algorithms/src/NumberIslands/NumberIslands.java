package algorithms.src.NumberIslands;

import java.util.LinkedList;
import java.util.Queue;

public class NumberIslands {
    public int numIslands(char[][] grid) {
        int result = 0;
        int x;
        int y ;
        int[] cur;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    result = result + 1;
                    queue.add(new int[]{i, j});
                    grid[i][j] = '0';
                    while (!queue.isEmpty()) {
                        cur = queue.remove();
                        x = cur[0];
                        y = cur[1];
                        if (x - 1 >= 0 && grid[x - 1][y] == '1') {
                            queue.add(new int[]{x - 1, y});
                            grid[x - 1][y] = '0';
                        }

                        if (x + 1 < grid.length && grid[x + 1][y] == '1') {
                            queue.add(new int[]{x + 1, y});
                            grid[x + 1][y] = '0';
                        }

                        if (y - 1 >= 0 && grid[x][y - 1] == '1') {
                            queue.add(new int[]{x, y - 1});
                            grid[x][y - 1] = '0';
                        }

                        if (y + 1 < grid[0].length && grid[x][y + 1] == '1') {
                            queue.add(new int[]{x, y + 1});
                            grid[x][y + 1] = '0';
                        }
                    }
                }
            }
        }

        return result;
    }
}
