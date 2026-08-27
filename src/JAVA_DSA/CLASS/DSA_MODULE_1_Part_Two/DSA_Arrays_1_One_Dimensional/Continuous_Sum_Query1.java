package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.Arrays;

public class Continuous_Sum_Query1 {
    public static int[] bruteforce(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;

        for (int i = 0; i < m; i++) {
            int idx = B[i][0];
            int val = B[i][1];

            for (int j = idx; j < n; j++) {
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
            int val = B[i][1];
            A[idx] = val;
        }
        for (int i = 1; i < n; i++) {
            A[i] += A[i - 1];
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 3}, {4, -2}, {3, 1}};
        int[] A = new int[7];
//        System.out.println(Arrays.toString(bruteforce(A, mat)));
        System.out.println(Arrays.toString(solve(A,mat)));

    }
}
