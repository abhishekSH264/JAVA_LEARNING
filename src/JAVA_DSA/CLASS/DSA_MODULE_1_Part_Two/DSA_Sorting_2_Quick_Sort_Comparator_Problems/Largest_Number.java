package CLASS.DSA_MODULE_1_Part_Two.DSA_Sorting_2_Quick_Sort_Comparator_Problems;

import java.util.ArrayList;
import java.util.Collections;

public class Largest_Number {
    public static String solve(ArrayList<Integer> A) {
        int n  = A.size();
        Collections.sort(A,(a,b)->{
            String ab = a+""+b;
            String ba = b+""+a;
            int val = ab.compareTo(ba);
            if(val<0){
                return 1;
            } else if (val>0) {
                return -1;
            }else{
                return 0;
            }
        });
        if(A.get(0)=='0'){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(A.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Collections.addAll(al, 3, 30, 34, 5, 9);
//        System.out.println(20+""+2);
        System.out.println(solve(al));
    }
}
