package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

import java.util.Arrays;

public class Subarray_in_given_range {
    public static int[] solve(int[]A,int B,int C){
        int[] res = new int[C-B+1];
        int j = 0;
        for(int i = B ; i <= C; i ++){
            res[j] = A[i];
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 1;
        int C = 3;
        System.out.println(Arrays.toString(solve(A,B,C)));
    }
}
