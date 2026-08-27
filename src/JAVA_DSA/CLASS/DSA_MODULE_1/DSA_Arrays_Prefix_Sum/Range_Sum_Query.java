package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Range_Sum_Query {
    public static long[] bruteforce(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        long[] prefix = new long[m];
        for (int i = 0; i < m; i++) {
            int start = B[i][0];
            int end = B[i][1];
            long sum = 0;
            for (int j = start; j <= end; j++) {
                sum += A[j];
            }
            prefix[i] = sum;
        }
        return prefix;
    }

    public static long[] solve(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        long[] prefix = new long[n];
        prefix[0] = A[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        long[] ans = new long[m];
        for (int i = 0; i < m; i++) {
            int start = B[i][0];
            int end = B[i][1];
            if(start == 0){
                ans[i] = prefix[end];
            }else{
                ans[i] = prefix[end] - prefix[start-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[][] b = {{0, 3}, {1, 2}};
        int[] c = {2, 2, 2};
        int[][] d = {{0, 0}, {1, 2}};
        System.out.println(Arrays.toString(bruteforce(a, b)));
        System.out.println(Arrays.toString(bruteforce(c, d)));
        System.out.println(Arrays.toString(solve(a,b)));
        System.out.println(Arrays.toString(solve(c,d)));
    }
}
