package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class In_place_Prefix_Sum {
    public static int[] solve(int[]A){
        int n = A.length;
        for(int i = 1; i <  n; i ++){
            A[i] = A[i-1] + A[i];
        }
        return A;
    }
    public static void main(String[] args){
        int[]A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solve(A)));
    }
}
