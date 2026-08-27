package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

import java.util.Arrays;

public class Anti_Diagonals {
    public static int[] antiDiagonals(int[][] A, int i, int j) {
        int n = A.length;
        int row = i;
        int col = j;
        int[] ans = new int[n];
        int K = 0;
        while (row < n && col >= 0) {
            ans[K++] = A[row][col];
            row++;col--;
        }
        return ans;
    }
    public static int[][] solve(int[][]A){
        int n = A.length;
        int[][] ans = new int[(n+n) - 1][n];
        int K = 0;
        for(int j = 0; j < n; j++){
            ans[K++] = antiDiagonals(A,0,j);
        }
        for(int i = 1; i < n; i++){
            ans[K++] = antiDiagonals(A,i,n-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};
        System.out.println(Arrays.deepToString((solve(A))));
    }
}
