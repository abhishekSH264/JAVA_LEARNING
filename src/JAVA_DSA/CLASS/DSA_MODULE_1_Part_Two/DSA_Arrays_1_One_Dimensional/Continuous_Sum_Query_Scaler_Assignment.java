package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.Arrays;

public class Continuous_Sum_Query_Scaler_Assignment {
    public static int[] solve(int A, int[][] B) {
        int[] arr = new int[A];

        int m = B.length;
        for (int i = 0; i < m; i++) {
            int idx = B[i][0] - 1;
            int end = B[i][1] - 1;
            int val = B[i][2];
            arr[idx] += val;
            if (end + 1 < A) {
                arr[end + 1] -= val;
            }
        }
        for (int i = 1; i < A; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int A = 5;
        int[][] Q = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        System.out.println(Arrays.toString(solve(A, Q)));
    }
}
