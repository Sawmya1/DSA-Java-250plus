import java.util.* ;
import java.io.*; 
import java.util.List;
import java.util.ArrayList;

public class MergeIntervals {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
       Arrays.sort(intervals, (a,b)->a.start-b.start);
       ArrayList<Interval> result = new ArrayList<Interval>();
        int i, j ;
        for(i = 0 ; i < intervals.length ;) 
        {
            j = i + 1;
            while(j < intervals.length && intervals[j].start < 1 + intervals[i].finish)
            {
                intervals[i].finish = Math.max(intervals[i].finish , intervals[j].finish);
                ++j;
            }
            result.add(intervals[i]);
            i = j;
        }
        return result;

//        Collections.sort(intervals, (a,b) -> a.get(0) - b.get(0));
//         ArrayList < List < Integer >> merged = new ArrayList < > ();
//         for(int i=0; i<intervals.size(); i++){
//            if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < intervals.get(i).get(0)) {
//                 ArrayList < Integer > v = new ArrayList < > ();
//                 v.add(intervals.get(i).get(0));
//                 v.add(intervals.get(i).get(1));

//                 merged.add(v);
//             } else {
//                 merged.get(merged.size() - 1).set(1, Math.max(merged.get(merged.size() - 1).get(1), intervals.get(i).get(1)));
//             }
//         }
//         return merged;
    }
}
