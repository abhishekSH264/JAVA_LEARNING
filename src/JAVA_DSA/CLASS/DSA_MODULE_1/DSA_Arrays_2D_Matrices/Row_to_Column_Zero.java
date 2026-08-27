package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

import java.util.Arrays;

public class Row_to_Column_Zero {
    public static int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4},
                     {5, 6, 7, 0},
                     {9, 2, 0, 4}};
        System.out.println(Arrays.deepToString(solve(A)));
//        System.out.println(Arrays.deepToString(solve1(A)));
    }
}
