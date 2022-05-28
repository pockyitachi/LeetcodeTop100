package C4NumsOfIslands;

public class test {
    public static void main(String[] args) {
        char[][] grid = {{'1','1','0','0','0'},
                         {'1','1','0','0','0'},
                         {'0','0','1','0','0'},
                         {'0','0','0','1','1'}};
        NumsOfIslands test = new NumsOfIslands();
        int num = test.numIslands(grid);
        System.out.println(num);
    }
}
