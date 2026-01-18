package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Range_Sum_Query {

    public static long[] bruteforce(int[] A, int[][] Q) {
        int m = Q.length;
        long[] arr = new long[m];

        for(int i = 0; i < m; i++){
            int start = Q[i][0];
            int end = Q[i][1];
            long sum = 0;
            for (int j = start; j <= end; j++) {
                sum += A[j];
            }
            arr[i] = sum;
        }
        return arr;
    }

    //using prefix sum array
    public static long[] solve(int[] A, int[][] Q) {
        int m = Q.length;
        int n = A.length;

        long[] psum = new long[n];
        psum[0] = A[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i-1] + A[i];
        }
        long[] arr = new long[m];
        for(int i = 0; i < m; i++){
            int start = Q[i][0];
            int end = Q[i][1];
            if(start==0){
                arr[i] = psum[end];
            }else{
                arr[i] = psum[end] - psum[start-1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[][] b = {{0, 3}, {1, 2}};
        int[] c = {2, 2, 2};
        int[][] d = {{0, 0}, {1, 2}};
        System.out.println(Arrays.toString(bruteforce(a, b)));
        System.out.println(Arrays.toString(solve(a,b)));
    }
}
