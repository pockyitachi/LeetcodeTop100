package C4NumsOfIslands;

public class test {
    public static void main(String[] args) {
        char[][] grid1 = {{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};
        char[][] grid2 = {{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};
        NumsOfIslands test = new NumsOfIslands();
        int num = test.numIslands(grid1);
        System.out.println(num);

        BFSOfIslands test2 = new BFSOfIslands();
        int num2 = test2.numsOfIslands(grid2);
        System.out.println(num2);
    }
}
