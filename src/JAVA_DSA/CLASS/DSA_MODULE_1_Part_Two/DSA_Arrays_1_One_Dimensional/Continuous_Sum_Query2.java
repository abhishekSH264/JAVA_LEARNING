package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.Arrays;

public class Continuous_Sum_Query2 {
    public static int[] bruteforce(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;

        for (int i = 0; i < m; i++) {
            int idx = B[i][0];
            int end = B[i][1];
            int val = B[i][2];

            for (int j = idx; j <= end; j++) {
                A[j] += val;
            }
        }
        return A;
    }

    public static int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;

        for (int i = 0; i < m; i++) {
            int idx = B[i][0];
            int end = B[i][1];
            int val = B[i][2];
            A[idx] += val;
            if (end+1 < n) {
                A[end+1] -= val;
            }
        }
        for (int i = 1; i < n; i++) {
            A[i] += A[i - 1];
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 3, 2}, {4, 5, 3}, {3, 6, -1}};
        int[] A = new int[7];
//        System.out.println(Arrays.toString(bruteforce(A, mat)));
        System.out.println(Arrays.toString(solve(A, mat)));
    }
}
