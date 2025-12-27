package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Count_of_Odd_number_in_a_range {
    public static int[] bruteforce(int[] A, int[][] Q) {
        int n = A.length;
        int m = Q.length;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            int l = Q[i][0];
            int r = Q[i][1];
            int count = 0;

            for (int j = l; j <= r; j++) {
                if (A[j] % 2 != 0) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

    public static int[] solve(int[] A, int[][] Q) {
        int n = A.length;
        int m = Q.length;

        int[] psum = new int[n];
        if (A[0] % 2 != 0) {
            psum[0] = 1;
        } else {
            psum[0] = 0;
        }
        for (int i = 1; i < n; i++) {
            if (A[i] % 2 != 0) {
                psum[i] = psum[i - 1] + 1;
            } else {
                psum[i] = psum[i - 1];
            }
        }
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            int l = Q[i][0];
            int r = Q[i][1];

            if (l == 0) {
                arr[i] = psum[r];
            }else{
                arr[i] = psum[r] - psum[l-1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0, 4}, {1, 3}};
        System.out.println(Arrays.toString(bruteforce(A, B)));
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
