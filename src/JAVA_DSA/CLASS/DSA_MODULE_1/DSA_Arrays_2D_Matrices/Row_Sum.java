package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

import java.util.Arrays;

public class Row_Sum {
    public static int[] solve(int[][]A){
        int n = A.length;
        int[]arr = new int[n];
        for(int i = 0; i < n; i++){
            int m = A[i].length;
            int sum = 0;
            for(int j = 0; j < m; j++){
                arr[i] = sum+=A[i][j];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        System.out.println(Arrays.toString(solve(A)));
    }
}
