package C4NumsOfIslands;

public class NumsOfIslands {
    final static int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    public int numIslands(char[][] grid) {
        //sanity check
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j, rows, cols);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] array, int x, int y, int rows, int cols){
        // base case
        if(x < 0 || x >= rows || y < 0 || y >= cols || array[x][y] == '0'){
            return;
        }
        // recursion rule
        array[x][y] = '0';
        for(int[] dir : dirs){
            int neighbourX = x + dir[0];
            int neighbourY = y + dir[1];
            dfs(array, neighbourX, neighbourY, rows, cols);
        }
    }
}
/*DFS:
Time complexity : O(M×N) where M is the number of rows and N is the number of columns.
Space complexity : worst case O(M×N) in case that the grid map is filled with lands where DFS goes by M×N deep.
*/
