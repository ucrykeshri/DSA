package Arrays;

import java.util.ArrayList;

public class MergeOverlappingIntervals extends Interval {
    /*
     * Definition for an interval.
     **/
    public static  ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        intervals.sort((i1, i2) -> i1.start - i2.start);
        ArrayList<Interval> result = new ArrayList<Interval>();
        Interval interval = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval nextInterval = intervals.get(i);

            // Check intersection
            if (interval.start <= nextInterval.end && interval.end >= nextInterval.start) {
                interval = new Interval(Math.min(interval.start, nextInterval.start), Math.max(interval.end, nextInterval.end));
            } else {
                result.add(interval);
                interval = nextInterval;
            }
        }
        result.add(interval);

        return result;
    }
    public static void  main(String args[]){
        ArrayList<Interval> list = new ArrayList<>();
        list.add(new Interval(1,3));
        list.add(new Interval(2,6));
        list.add(new Interval(8,10));
        list.add(new Interval(15,18));
        ArrayList<Interval> ans = merge(list);
        for(Interval i:ans){
            System.out.print(i);
        }
    }
}
    class Interval {
         int start;
          int end;
          Interval() { start = 0; end = 0; }
          Interval(int s, int e) { start = s; end = e; }
      }
