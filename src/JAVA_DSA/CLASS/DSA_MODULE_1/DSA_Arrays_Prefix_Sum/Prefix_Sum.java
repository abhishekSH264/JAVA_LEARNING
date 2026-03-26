package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Prefix_Sum {
    public static int[] solve(int[]A){
        int n = A.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = A[0];
        for(int i = 1; i < n;i++){
            prefixSum[i] = prefixSum[i-1] + A[i];
        }
        return prefixSum;
    }
    public static void main(String[] args) {
        int[]A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solve(A)));
    }
}
