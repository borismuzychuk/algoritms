package org.muzychuk.boris;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    private final static int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int numIslands(char[][] grid) {
        int islandCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    bsf(grid, i, j);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    public void bsf(char[][] grid, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int row = node[0];
            int col = node[1];
            for (int[] dir : DIRECTIONS) {
                int r = row + dir[0];
                int c = col + dir[1];
                if (r >= 0 && r < grid.length &&
                        c >= 0 && c < grid[0].length &&
                        grid[r][c] == '1') {
                    queue.offer(new int[]{r, c});
                    grid[r][c] = '0';
                }
            }
        }
    }

}
