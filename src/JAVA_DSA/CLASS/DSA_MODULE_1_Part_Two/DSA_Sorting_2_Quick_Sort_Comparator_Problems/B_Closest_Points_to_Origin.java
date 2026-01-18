package CLASS.DSA_MODULE_1_Part_Two.DSA_Sorting_2_Quick_Sort_Comparator_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B_Closest_Points_to_Origin {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B){
        Collections.sort(A,(p1,p2)->{
            int d1 = p1.get(0)*p1.get(0)+p1.get(1)*p1.get(1);
            int d2 = p2.get(0)*p2.get(0)+p2.get(1)*p2.get(1);
            if(d1==d2){
                return 0;
            } else if (d1<d2) {
                return -1;
            }else{
                return 1;
            }
        });
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i=0;i<B;i++){
            al.add(A.get(i));
        }
        return al;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        A.add(new ArrayList<>(Arrays.asList(1, 3)));
        A.add(new ArrayList<>(Arrays.asList(-2, 2)));

        System.out.println(solve(A,1));
    }
}
