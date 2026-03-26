package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.Arrays;

public class Continuous_Sum_Query_3 {
    public static int[] solve(int[][] b, int[] A) {
        int n = A.length;
        int m = b.length;

        for (int i = 0; i < m; i++) {
            int start = b[i][0] - 1;
            int end = b[i][1] - 1;
            int val = b[i][2];
            A[start] += val;
            if (end + 1 < n) {
                A[end + 1] -= val;
            }
        }
        for (int i = 1; i < n; i++) {
            A[i]+=A[i-1];
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = new int[5];
        int[][] Q = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        System.out.println(Arrays.toString(solve(Q,A)));
    }
}
