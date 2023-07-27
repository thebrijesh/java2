import java.util.ArrayList;
import java.util.List;

public class Insert_Interval {

    public void pseudocode(){
//        int[][] intervals2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
//        int[] newInterval2 = {4, 8};
//        make a list;
//
//        declare the first for loop
//        I<n and check the condition arr[I][1] < narr[0]
//        add an element to the list(I)
//
//                declare the second loop
//        I < n and check the condition arr[I][0]<narr[1]
//        compare array 0 index and narray 0 index. small element insert in narray 0 index.
//                compare array 1 index and narray 1 index. large element insert in narray 1 index.
//                add narray to the list.
//
//        declare the third loop
//        i < n and add remaining all elements to the list



    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> mergedIntervals = new ArrayList<>();

        int i = 0;
        int n = intervals.length;
        int[][] intervals2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval2 = {4, 8};
        // Add all intervals before the new interval that don't overlap
        while (i < n && intervals[i][1] < newInterval[0]) {
            mergedIntervals.add(intervals[i]);
            i++;
        }

         // Merge overlapping intervals with the new interval
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }   

        mergedIntervals.add(newInterval);

        // Add remaining intervals after the merged interval
        while (i < n) {
            mergedIntervals.add(intervals[i]);
            i++;
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

    public static void main(String[] args) {
        Insert_Interval solution = new Insert_Interval();

        int[][] intervals1 = {{1, 3}, {6, 9}};
        int[] newInterval1 = {2, 5};
        int[][] result1 = solution.insert(intervals1, newInterval1);
        printIntervals(result1);

        int[][] intervals2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval2 = {4, 8};
        int[][] result2 = solution.insert(intervals2, newInterval2);
        printIntervals(result2);
    }

    private static void printIntervals(int[][] intervals) {
        for (int[] interval : intervals) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
        System.out.println();
    }

}
