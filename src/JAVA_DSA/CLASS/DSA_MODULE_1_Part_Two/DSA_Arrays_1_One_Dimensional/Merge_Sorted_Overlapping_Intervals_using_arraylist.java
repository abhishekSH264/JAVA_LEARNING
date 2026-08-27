package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.ArrayList;

public class Merge_Sorted_Overlapping_Intervals_using_arraylist {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int start = A.get(0).get(0);
        int end = A.get(0).get(1);

        for (int i = 1; i < n; i++) {
            int curStart = A.get(i).get(0);
            int curEnd = A.get(i).get(1);

            if (end >= curStart) {
                end = Math.max(end, curEnd);
                start = Math.min(start, curStart);
            } else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(end);
                al.add(start);
                ans.add(al);
                end = curEnd;
                start = curStart;
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        al.add(start);
        al.add(end);
        ans.add(al);
        return ans;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

    }
}
