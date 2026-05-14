package org.muzychuk.boris;

import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaOfIsland {

    private final static int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, bfs(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    public int bfs(int[][] grid, int i, int j) {
        int areaOfIsland = 1;
        grid[i][j] = 0;
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
                        grid[r][c] == 1) {
                    areaOfIsland++;
                    queue.offer(new int[]{r, c});
                    grid[r][c] = 0;
                }
            }
        }
        return areaOfIsland;
    }

}
