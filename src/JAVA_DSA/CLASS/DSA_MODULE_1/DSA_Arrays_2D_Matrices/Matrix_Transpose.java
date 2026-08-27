package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

import java.util.Arrays;

public class Matrix_Transpose {
    public static int[][] solve(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int m = A[i].length;
            for (int j = i + 1; j < m; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(solve(A)));
    }
}
