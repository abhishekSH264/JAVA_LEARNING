package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

import java.util.Arrays;

public class Generate_all_subarrays {
    public static int[][] solve(int[] A) {
        int n = A.length;
        int length = n * (n + 1) / 2;
        int[][] arr = new int[length][];
        int row = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int l = j - i + 1;
                int[] al = new int[l];
                int col = 0;
                for (int k = i; k <= j; k++) {
                    al[col] = A[k];
                    col++;
                }
                arr[row] = al;
                row++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(Arrays.deepToString(solve(A)));
    }
}
