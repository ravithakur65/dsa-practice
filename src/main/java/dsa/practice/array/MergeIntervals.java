package dsa.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals1 = {{1,3},{2,6},{1,4},{13,20},{8,10},{15,18}};
        int[][] merged1 = merge(intervals1);
        System.out.println(Arrays.deepToString(merged1)); // [[1, 6], [8, 10], [15, 18]]

        int[][] intervals2 = {{1,4},{4,5}};
        int[][] merged2 = merge(intervals2);
        System.out.println(Arrays.deepToString(merged2)); // [[1, 5]]
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for(int[] interval: intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(nextStart <= currentEnd) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            }else {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }

        return result.toArray(new int[result.size()][]);

    }
}
