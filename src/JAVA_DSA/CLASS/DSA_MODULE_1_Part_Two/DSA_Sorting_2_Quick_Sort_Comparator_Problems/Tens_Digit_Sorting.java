package CLASS.DSA_MODULE_1_Part_Two.DSA_Sorting_2_Quick_Sort_Comparator_Problems;

import java.util.ArrayList;
import java.util.Collections;

public class Tens_Digit_Sorting {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A,(a,b)->{
            int temp1 = (a/10)%10;
            int temp2 = (b/10)%10;
            if(temp1 < temp2){
                return -1;
            } else if (temp1 > temp2) {
                return 1;
            }else{
                if(a < b){
                    return 1;
                } else if (a > b) {
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        return A;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Collections.addAll(al,15, 11, 7, 19);
        int[] A = {15, 11, 7, 19};
        System.out.println(solve(al));
    }
}
