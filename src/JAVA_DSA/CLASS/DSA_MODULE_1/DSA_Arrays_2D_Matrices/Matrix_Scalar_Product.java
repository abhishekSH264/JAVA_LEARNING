package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

import java.util.Arrays;

public class Matrix_Scalar_Product {
    public static int[][] solve(int[][] A, int B) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int m = A[i].length;
            for (int j = 0; j < m; j++) {
                A[i][j] = A[i][j] * B;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B = 2;
        System.out.println(Arrays.deepToString(solve(A, B)));
    }
}
