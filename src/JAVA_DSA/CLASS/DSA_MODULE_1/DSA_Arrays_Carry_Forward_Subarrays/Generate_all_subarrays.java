package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

import java.util.Arrays;

public class Generate_all_subarrays {
    public static int[][] solve(int[] A) {
        int n = A.length;
        int size = n * (n + 1) / 2;
        int[][] ans = new int[size][];
        int l = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int len = j - i + 1;
                int[] arr = new int[len];
                int r = 0;
                for (int k = i; k <= j; k++) {
                    arr[r++] = A[k];
                }
                ans[l++] = arr;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(Arrays.deepToString(solve(A)));
    }
}
