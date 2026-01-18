package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_3_Interview_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Sorted_Overlapping_Intervals_2 {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> al) {
        int n = al.size();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int start = al.get(0).get(0);
        int end = al.get(0).get(1);
        for (int i = 1; i < n; i++) {
            int curStart = al.get(i).get(0);
            //System.out.println(curStart);
            int curEnd = al.get(i).get(1);
            //System.out.println(curEnd);
            if(end >= curStart){
                start = Math.min(start,curStart);
                System.out.println(start);
                end = Math.max(end,curEnd);
                System.out.println(end);
            }else{
                ArrayList<Integer> ll = new ArrayList<>();
                ll.add(start);
                ll.add(end);
                start = curStart;
                end = curEnd;
                arr.add(ll);
            }
        }
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(start);
        ll.add(end);
        arr.add(ll);
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        arr.add(new ArrayList<>(Arrays.asList(1, 5)));
        arr.add(new ArrayList<>(Arrays.asList(4, 6)));
        arr.add(new ArrayList<>(Arrays.asList(7, 20)));
        arr.add(new ArrayList<>(Arrays.asList(15, 30)));
        arr.add(new ArrayList<>(Arrays.asList(31, 34)));
        arr.add(new ArrayList<>(Arrays.asList(35, 50)));
        System.out.println(solve(arr));
    }
}
