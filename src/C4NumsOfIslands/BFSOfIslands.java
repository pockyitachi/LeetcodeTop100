package C4NumsOfIslands;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFSOfIslands {
    final static int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    public int numsOfIslands(char[][] grid) {
        //sanity check
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    //bfs
                    bfs(grid, i, j, rows, cols);
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int x, int y, int rows, int cols) {
        Queue<Integer> neighbours = new ArrayDeque<>();
        neighbours.add(x * cols + y);
        grid[x][y] = '0';
        while (!neighbours.isEmpty()) {
            int id = neighbours.poll();
            int row = id / cols;
            int col = id % cols;
            for(int[] dir : dirs){
                int neighbourX = dir[0] + row;
                int neighbourY = dir[1] + col;
                if(neighbourX > -1 && neighbourX < rows && neighbourY > -1 && neighbourY < cols
                && grid[neighbourX][neighbourY] == '1'){
                    grid[neighbourX][neighbourY] = '0';
                    neighbours.add(neighbourX * cols + neighbourY);
                }
            }
        }
    }
}
/*BFS
Time complexity : O(M×N) where M is the number of rows and N is the number of columns.
Space complexity : O(min(M,N)) because in worst case where the grid is filled with lands,
                   the size of queue can grow up to min(M,N).
 */
