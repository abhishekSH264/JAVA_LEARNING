package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.Arrays;

public class Continuous_Sum_Query2 {
    public static int[] bruteforce(int[][] Q, int[] A) {
        int n = A.length;
        int m = Q.length;
        for (int i = 0; i < m; i++) {
            int start = Q[i][0];
            int end = Q[i][1];
            int val = Q[i][2];
            for (int j = start; j <= end; j++) {
                A[j] += val;
            }
        }
        return A;
    }

    public static int[] solve(int[][] Q, int[] A) {
        int n = A.length;
        int m = Q.length;

        for (int i = 0; i < m; i++) {
            int start = Q[i][0];
            int end = Q[i][1];
            int val = Q[i][2];
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
    public static void main(String[] args){
        int[][] mat = {{1,3,2},{4,5,3},{3,6,-1}};
        int[]A = new int[7];
//        System.out.println(Arrays.toString(bruteforce(mat, A)));
        System.out.println(Arrays.toString(solve(mat, A)));
    }
}
