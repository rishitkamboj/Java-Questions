package leetcodesques;

import java.util.ArrayList;
import java.util.List;

public class insertinterval57 {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> r = new ArrayList<>();
        int i = 0;

        // no overlapping
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            r.add(intervals[i]);
            i++;
        }

        //overlapping
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        r.add(newInterval);
        //remaing after overlapping
        while (i < intervals.length) {
            r.add(intervals[i]);
            i++;
        }

        return r.toArray(new int[r.size()][]);


    }
}