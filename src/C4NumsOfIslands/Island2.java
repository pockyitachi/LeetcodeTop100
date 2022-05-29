package C4NumsOfIslands;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Island2 {
    final static int[][] DIRS = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    public List<Integer> numIslands(int m, int n, int[][] positions) {
        // Write your solution here
        List<Integer> res = new ArrayList<>();
        int[][] grid = new int[m][n];
        for(int[] pos : positions){
            int x = pos[0];
            int y = pos[1];
            grid[x][y] = 1;
            int num = findIslandsNumber(grid);
            res.add(num);
        }
        return res;
    }
    private int findIslandsNumber(int grid[][]){
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    count++;
                    bfs(grid, i, j, rows, cols, visited);
                }
            }
        }
        return count;
    }
    private void bfs(int[][] grid, int x, int y, int rows, int cols, boolean[][] visited){
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(x * cols + y);
        visited[x][y] = true;
        while(!q.isEmpty()){
            int id = q.poll();
            int row = id / cols;
            int col = id % cols;
            for(int[] dir : DIRS){
                int neighbourX = dir[0] + row;
                int neighbourY = dir[1] + col;
                if(neighbourX > -1 && neighbourX < rows && neighbourY > -1 && neighbourY < cols
                        && grid[neighbourX][neighbourY] == 1 && !visited[neighbourX][neighbourY]){
                    q.offer(neighbourX * cols + neighbourY);
                    visited[neighbourX][neighbourY] = true;
                }
            }
        }
    }
}
