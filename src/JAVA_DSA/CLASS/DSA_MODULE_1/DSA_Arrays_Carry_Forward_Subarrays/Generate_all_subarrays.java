package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

import java.util.Arrays;

public class Generate_all_subarrays {
    public static int[][] solve(int[] A) {
        int n = A.length;
        int length = n * (n + 1) / 2;
        int[][] arr = new int[length][];
        int k = 0;
        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                int l = e - s + 1;
                int[] al = new int[l];
                int j = 0;
                for (int i = s; i <= e; i++) {
                    al[j] = A[i];
                    j++;
                }
                arr[k] = al;
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(Arrays.deepToString(solve(A)));
    }
}
