package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

import java.util.Arrays;

public class Column_Sum {
    public static int[] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[] arr = new int[m];
        for (int j = 0; j < m; j++) {
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum+=A[i][j];
            }
            arr[j] = sum;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 3, 4}};
        System.out.println(Arrays.toString(solve(A)));
    }
}
