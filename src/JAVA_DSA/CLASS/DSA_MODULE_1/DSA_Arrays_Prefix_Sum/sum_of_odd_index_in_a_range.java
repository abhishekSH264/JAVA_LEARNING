package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class sum_of_odd_index_in_a_range {
    public static int[] bruteforce(int[] A, int[][] Q) {
        int m = Q.length;
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            int start = Q[i][0];
            int end = Q[i][1];
            int sum = 0;
            for (int j = start; j <= end; j++) {
                if (j % 2 != 0) {
                    sum += A[j];
                }
            }
            arr[i] = sum;
        }
        return arr;
    }

    public static int[] solve(int[] A, int[][] Q) {
        int n = A.length;
        int m = Q.length;

        int[] psum = new int[n];
        psum[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                psum[i] = psum[i - 1] + A[i];
            } else {
                psum[i] = psum[i - 1];
            }
        }
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            int start = Q[i][0];
            int end = Q[i][1];
            if(start == 0){
                arr[i] = psum[end];
            }else{
                arr[i] = psum[end] - psum[start-1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 10};
        int[][] B = {{0, 3}, {1, 4}, {2, 4}};
        System.out.println(Arrays.toString(bruteforce(A, B)));
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
