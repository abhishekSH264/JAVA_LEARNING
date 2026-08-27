package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Intervals_Insert_intervals {
    public static int[][] solve(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i = 0;
        ArrayList<int[]> al = new ArrayList<>();
        while (i < n && intervals[i][1] < newInterval[0]){
            al.add(intervals[i]);
            i++;
        }
        while (i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
//            System.out.println(Arrays.toString(newInterval));
            i++;
        }
        al.add(newInterval);
        while (i < n){
            al.add(intervals[i]);
            i++;
        }
        return al.toArray(new int[al.size()][]);
    }

    public static void main(String[] args) {
        int[][] A = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] B = {{1, 2}, {4, 5}, {7, 9}, {11, 13}};
        int[] C = {3, 8};
        System.out.println(Arrays.deepToString(solve(A, newInterval)));
        System.out.println(Arrays.deepToString(solve(B, C)));
    }
}
