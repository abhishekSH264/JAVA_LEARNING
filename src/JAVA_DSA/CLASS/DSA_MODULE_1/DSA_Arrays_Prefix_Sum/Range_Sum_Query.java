package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Range_Sum_Query {
    //Bruteforce
    public static long[] bruteforce(int[][] Q, int[] A) {
        int n = A.length;
        int m = Q.length;
        long[] res = new long[m];
        for(int i = 0; i < m; i++){
            int start = Q[i][0];
            int end = Q[i][1];
            long sum = 0;
            for (int j = start; j <= end; j++) {
                sum += A[j];
            }
            res[i] = sum;
        }
        return res;
    }

    public static int[] solve(int[][] Q, int[] A) {
        int n = A.length;
        int m = Q.length;
        int[] psum = new int[n];
        int[] res = new int[m];

        psum[0] = A[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + A[i];
        }
        for (int i = 0; i < m; i++) {
            int start = Q[i][0];
            int end = Q[i][1];
            if(start == 0){
                res[i] = psum[end];
            }else{
                res[i] = psum[end] - psum[start-1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[][] b = {{0, 3}, {1, 2}};
        int[] c = {2, 2, 2};
        int[][] d = {{0, 0}, {1, 2}};
        System.out.println(Arrays.toString(bruteforce(b, a)));
        System.out.println(Arrays.toString(solve(b,a)));
    }
}
