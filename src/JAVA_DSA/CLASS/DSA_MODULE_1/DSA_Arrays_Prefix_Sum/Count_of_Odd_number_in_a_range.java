package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Count_of_Odd_number_in_a_range {
    public static int[] bruteforce(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;

        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            int start = B[i][0];
            int end = B[i][1];
            int count = 0;
            for (int j = start; j <= end; j++) {
                if (A[j] % 2 != 0) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        int[] psum = new int[n];
        if (A[0] % 2 != 0) {
            psum[0] = 1;
        } else {
            psum[0] = 0;
        }
        for (int i = 1; i < n; i++) {
            if (A[i] % 2 != 0) {
                psum[i] = psum[i - 1] + 1;
            } else {
                psum[i] = psum[i - 1];
            }
        }
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int start = B[i][0];
            int end = B[i][1];

            if(start == 0){
                ans[i] = psum[end];
            }else{
                ans[i] = psum[end] - psum[start - 1];
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0, 4}, {1, 3}};
        System.out.println(Arrays.toString(bruteforce(A, B)));
        System.out.println(Arrays.toString(solve(A, B)));
    }
}
