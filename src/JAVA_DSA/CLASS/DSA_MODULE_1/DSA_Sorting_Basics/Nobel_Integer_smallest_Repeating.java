package CLASS.DSA_MODULE_1.DSA_Sorting_Basics;

import java.util.Arrays;

public class Nobel_Integer_smallest_Repeating {
    public static int solve(int[]A){
        int n = A.length;
        int noble = 0;
        int count = 0;

        if(A[0] == 0){
            noble++;
        }
        for(int i = 1; i < n; i++){
            if(A[i] != A[i-1]){
                count = i;
            }
            if(count == A[i]){
                noble++;
            }
        }
        return noble;
    }
    public static void main(String[] args) {
        //        0  1  2  3  4
        int[] A = {0, 1, 2, 2, 3};
        System.out.println(solve(A));
    }
}
