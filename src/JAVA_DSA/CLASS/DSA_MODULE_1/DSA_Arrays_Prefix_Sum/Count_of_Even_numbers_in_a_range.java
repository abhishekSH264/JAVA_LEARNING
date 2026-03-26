package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

//Finding the sum of the Even index elements for the Q queries
public class Count_of_Even_numbers_in_a_range {
    public static int[] solve(int[][] Q, int[] A) {
        int n = A.length;
        int m = Q.length;

        int[] psum = new int[n];
        int[] res = new int[m];
        if (A[0] % 2 == 0) {
            psum[0] = 1;
        } else {
            psum[0] = 0;
        }
        for (int i = 1; i < n; i++) {
            if (A[i] % 2 == 0) {
                psum[i] = psum[i - 1] + 1;
            }else{
                psum[i] = psum[i - 1];
            }
        }
        for (int i = 0; i < m; i++) {
            int start = Q[i][0];
            int end = Q[i][1];
            if (start == 0) {
                res[i] = psum[end];
            } else {
                res[i] = psum[end] - psum[start - 1];
            }
        }
        return res;
    }

    public static int[] bruteforce(int[][] Q, int[] A) {
        int n = A.length;
        int m = Q.length;
        int[]res = new int[m];
        for (int i = 0; i <m; i++){
            int start = Q[i][0];
            int end = Q[i][1];
            int count = 0;
            for(int j = start; j <= end; j++){
                if(A[j]%2==0){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] b = {{0, 2}, {2, 4}, {1, 4}};
        int[] B = {2, 1, 8, 3, 9, 6};
        int[][] C = {{0, 3}, {3, 5}, {1, 3}, {2, 4}};
        System.out.println(Arrays.toString(solve(b, A)));
        System.out.println(Arrays.toString(bruteforce(b,A)));
        System.out.println(Arrays.toString(bruteforce(C,B)));

    }
}
