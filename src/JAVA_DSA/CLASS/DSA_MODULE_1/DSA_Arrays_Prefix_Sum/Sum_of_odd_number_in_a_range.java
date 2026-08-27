package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Sum_of_odd_number_in_a_range {
    public static int[] bruteforce(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;

        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            int start = B[i][0];
            int end = B[i][1];
            int sum = 0;
            for (int j = start; j <= end; j++) {
                if (A[j] % 2 != 0) {
                    sum += A[j];
                }
            }
            ans[i] = sum;
        }
        return ans;
    }

    public static int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        int[] ans = new int[m];
        int[] psum = new int[n];
        if (A[0] % 2 != 0) {
            psum[0] = A[0];
        } else {
            psum[0] = 0;
        }
        for (int i = 1; i < n; i++) {
            if (A[i] % 2 != 0) {
                psum[i] = psum[i - 1] + A[i];
            } else {
                psum[i] = psum[i - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            int start = B[i][0];
            int end = B[i][1];

            if(start == 0){
                ans[i] = psum[end];
            }else{
                ans[i] = psum[end] - psum[start-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {3, 2, 7, 4, 9, 6};
        int[][] B = {{0, 3}, {1, 5}, {2, 4}};
        System.out.println(Arrays.toString(bruteforce(A, B)));
        System.out.println(Arrays.toString(solve(A, B)));

    }
}
