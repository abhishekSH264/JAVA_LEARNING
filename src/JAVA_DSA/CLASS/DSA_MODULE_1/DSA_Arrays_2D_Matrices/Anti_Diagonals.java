package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

import java.util.Arrays;

public class Anti_Diagonals {
    public static int[] antiDiagonal(int[][] A, int i, int j) {
        int n = A.length;
        int m = A[0].length;
        int row = i;
        int col = j;
        int[]res = new int[n];
        int k = 0;
        while(row < n && col >= 0){
            res[k++] = A[row][col];
            row++;col--;
        }
        return res;
    }

    public static int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] res = new int[n+m-1][];
        int k = 0;
        for(int i = 0 ; i < n; i++){
            res[k++] = antiDiagonal(A,0,i);
        }
        for(int i = 1; i < n; i++){
            res[k++] = antiDiagonal(A,i,n-1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};
        System.out.println(Arrays.deepToString((solve(A))));
    }
}
