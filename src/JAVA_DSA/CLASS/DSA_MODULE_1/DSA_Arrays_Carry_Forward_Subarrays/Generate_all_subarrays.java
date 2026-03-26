package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

import java.util.Arrays;

public class Generate_all_subarrays {
    public static int[][] solve(int[]A){
        int n = A.length;
        int[][] arr = new int[n*(n+1)/2][];
        int r = 0;
        for(int i = 0 ; i < n; i ++){
            for(int j = i; j <n ; j++){
                int length = j -i + 1;
                int[] al = new int[length];
                int l = 0;
                for(int K = i; K <= j; K++){
                    al[l] = A[K];
                    l++;
                }
                arr[r] = al;
                r++;

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(Arrays.deepToString(solve(A)));
    }
}
