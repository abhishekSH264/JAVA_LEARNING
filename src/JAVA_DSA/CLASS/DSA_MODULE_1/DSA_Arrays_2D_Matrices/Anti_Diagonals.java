package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

import java.util.Arrays;

public class Anti_Diagonals {
    public static int[] antiDiagonal(int[][] A, int i, int j) {
        int n = A.length;
        int m = A[0].length;
        int row = i;
        int col = j;
        int[] arr = new int[n];
        int K = 0;
        while (row < n && col >= 0) {
            arr[K] = A[row][col];
            K++;
            row++;
            col--;
        }
        return arr;
    }

    public static int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] arr = new int[n + n - 1][n];
        int K = 0;
        for (int j = 0; j < m; j++) {
            arr[K] = antiDiagonal(A, 0, j);
            K++;
        }
        for (int i = 1; i < n; i++) {
            arr[K] = antiDiagonal(A,i,m-1);
            K++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};
        System.out.println(Arrays.deepToString((solve(A))));
    }
}
