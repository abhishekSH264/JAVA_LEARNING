package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Sorted_Overlapping_Intervals_using_arrays {
    public static int[][] solve(int[][] A) {
        int n = A.length;
        ArrayList<int[]> al = new ArrayList<>();

        int start = A[0][0];
        int end = A[0][1];

        for (int i = 1; i < n; i++) {
            int curStart = A[i][0];
            int curEnd = A[i][1];
            if(end >= curStart){
                end = Math.max(end,curEnd);
                start = Math.min(start,curStart);
            }else{
                al.add(new int[]{start,end});
                start = curStart;
                end = curEnd;
            }
        }
        al.add(new int[]{start,end});
        return al.toArray(new int[al.size()][]);
    }

    public static void main(String[] args) {
        int[][] A = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(solve(A)));
    }
}
