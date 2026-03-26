package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Sum_of_even_number_in_a_range {

    public static int[] bruteforce(int[] A, int[][] Q) {
        int n = A.length;
        int m = Q.length;
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int start = Q[i][0];
            int end = Q[i][1];
            int sum = 0;
            for (int j = start; j <= end; j++) {
                if (A[j] % 2 == 0) {
                    sum += A[j];
                }
            }
            res[i] = sum;
        }
        return res;
    }
    public static int[] solve(int[] A, int[][] Q) {
        int n = A.length;
        int m = Q.length;
        int[] psum = new int[n];
        if (A[0] % 2 == 0) {
            psum[0] = A[0];
        } else {
            psum[0] = 0;
        }
        for (int i = 1; i < n; i++) {
            if (A[i] % 2 == 0) {
                psum[i] = psum[i - 1] + A[i];
            } else {
                psum[i] = psum[i - 1];
            }
        }
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int start = Q[i][0];
            int end = Q[i][1];
            if (start == 0) {
                res[i] = psum[end];
            } else {
                res[i] = psum[end] - psum[start - 1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] A = {3, 2, 8, 5, 10, 7};
        int[][] B = {{0, 3}, {1, 4}, {2, 5}};
        System.out.println(Arrays.toString(bruteforce(A, B)));
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
