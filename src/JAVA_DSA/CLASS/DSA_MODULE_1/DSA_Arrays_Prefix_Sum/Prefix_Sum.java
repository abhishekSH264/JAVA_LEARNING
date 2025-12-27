package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Prefix_Sum {
    public static int[] prefixsum(int[]A){
        int n = A.length;
        int[] psum = new int[n];
        psum[0] = A[0];
        for(int i = 1;i < n; i++){
            psum[i] = psum[i-1] + A[i];
        }
        return psum;
    }
    public static void main(String[] args) {
        int[]A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(prefixsum(A)));
    }
}
