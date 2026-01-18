package CLASS.DSA_MODULE_1_Part_Two.DSA_Sorting_2_Quick_Sort_Comparator_Problems;

import java.util.ArrayList;
import java.util.Collections;

public class Factors_sort {
    public static int factors(int A){
        int count  = 0;
        for(int i=1;i*i<=A;i++){
            if(A%i==0){
                if(i == A/i){
                    count+=1;
                }else{
                    count+=2;
                }
            }
        }
        return count;
    }
    public static ArrayList<Integer> solve(ArrayList<Integer>al){
        Collections.sort(al,(a,b)->{
            int d1 = factors(a);
            int d2 = factors(b);
            if(d1<d2){
                return -1;
            } else if (d1 > d2) {
                return 1;
            }else {
                if(a<b){
                    return -1;
                } else if (a>b) {
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Collections.addAll(al, 6, 8, 9);
        System.out.println(solve(al));
    }
}
