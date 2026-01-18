package CLASS.DSA_MODULE_1_Part_Two.DSA_Sorting_2_Quick_Sort_Comparator_Problems;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator_problem {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A, (a, b) -> {
            if (a == b) {
                return 0;
            } else if (a < b) {
                return -1;
            } else {
                return 1;
            }
        });
        return A;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Collections.addAll(al, 9, 10, 5, 6, 7, 1, 2);
        System.out.println(solve(al));
    }
}
