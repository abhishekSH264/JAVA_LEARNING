package CLASS.DSA_MODULE_1.DSA_Sorting_Basics;

import java.util.Arrays;

public class Kth_Smallest_Element {
    public static int solve(int[]A,int B){
        Arrays.sort(A);
        return  A[B-1];
    }

    public static void main(String[] args) {
        int[]A = {2, 1, 4, 3, 2};
        int B = 3;
        System.out.println(solve(A,B));
    }
}
