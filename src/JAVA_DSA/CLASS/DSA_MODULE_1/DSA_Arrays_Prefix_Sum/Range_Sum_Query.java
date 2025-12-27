package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Range_Sum_Query {
    
    public static int[] bruteforce(int[]A,int[][]Q){
        int n = Q.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            int l = Q[i][0];
            int r = Q[i][1];
            int sum = 0;
            for(int j = l; j <= r; j++){
                sum+=A[j];
            }
            arr[i] = sum;
        }
        return arr;
    }
    public static long[] solve(int[]A,int[][]B){
        int n = A.length;
        int m = B.length;
        long[] psum = new long[n];
        psum[0] = A[0];
        for(int i = 1 ;i < n; i++){
            psum[i] = psum[i-1] + A[i];
        }
        long[] arr = new long[m];
        for(int i = 0; i < m; i++){
            int l = B[i][0];
            int r = B[i][1];
            if(l == 0){
                arr[i] = psum[r];
            }else{
                arr[i] = psum[r] - psum[l-1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[][] b = {{0, 3}, {1, 2}};
        int[] c = {2, 2, 2};
        int[][] d = {{0, 0}, {1, 2}};
//        System.out.println(Arrays.toString(bruteforce(a,b)));
        System.out.println(Arrays.toString(solve(a,b)));
    }
}
