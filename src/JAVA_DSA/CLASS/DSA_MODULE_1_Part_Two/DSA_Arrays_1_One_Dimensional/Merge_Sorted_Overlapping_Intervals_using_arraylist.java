package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.ArrayList;

public class Merge_Sorted_Overlapping_Intervals_using_arraylist {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> al) {
        int n = al.size();
        int start = al.get(0).get(0);
        int end = al.get(0).get(1);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            int curStart = al.get(i).get(0);
            int curEnd = al.get(i).get(1);
            if(end >= curStart){
                start = Math.min(start,curStart);
                end = Math.max(end,curEnd);
            }else{
                ArrayList<Integer> ll= new ArrayList<>();
                ll.add(start);
                ll.add(end);
                arr.add(ll);
                start = curStart;
                end = curEnd;
            }
        }
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(start);
        ll.add(end);
        arr.add(ll);
        return arr;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println();
    }
}
