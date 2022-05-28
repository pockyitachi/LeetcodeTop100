package C3MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals == null ||intervals.length == 0 || intervals[0].length == 0){
            return intervals;
        }
        // Step 1: Sort the intervals by each start in ascending order
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        // The size of the matrix will be changed if there is overlapping -> so we use List
        List<int[]> res = new ArrayList<>();
        int[] curr = intervals[0];
        res.add(curr);
        for(int[] interval : intervals){
            int begin = curr[0];
            int end = curr[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];
            // overlapping -> update the end to the max one
            if(end >= nextBegin){
                curr[1] = Math.max(end, nextEnd);
            }else{
            // No overlapping-> update curr[]
                curr = interval;
                res.add(curr);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

}
