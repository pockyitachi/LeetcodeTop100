package C4NumsOfIslands;

import java.util.ArrayList;
import java.util.List;

public class Island2Test {
    public static void main(String[] args) {
        int m = 2;
        int n = 7;
        int[][] positions = {{0,1},{0,0},{0,3},{0,5},{0,2},{0,4}};
        Island2 test = new Island2();
        List<Integer> res =  test.numIslands(m, n, positions);
        System.out.println(res);
    }
}
