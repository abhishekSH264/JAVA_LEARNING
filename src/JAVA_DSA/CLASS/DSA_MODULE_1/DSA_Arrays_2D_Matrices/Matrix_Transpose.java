package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

import java.util.Arrays;

public class Matrix_Transpose {
    public static int[][] transpose(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][i] = A[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(transpose(A)));
    }
}
