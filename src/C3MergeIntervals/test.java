package C3MergeIntervals;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        MergeIntervals test = new MergeIntervals();
        int[][] res = test.merge(intervals);
        System.out.println(Arrays.deepToString(res));
    }
}
