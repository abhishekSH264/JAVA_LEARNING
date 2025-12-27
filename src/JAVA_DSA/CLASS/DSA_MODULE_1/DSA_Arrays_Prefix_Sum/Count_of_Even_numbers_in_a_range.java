package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

//Finding the sum of the Even index elements for the Q queries
public class Count_of_Even_numbers_in_a_range {
    public static int[] bruteforce(int[] A, int[][] Q) {
        int n = Q.length;
        int m = A.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int l = Q[i][0];
            int r = Q[i][1];
            int count = 0;
            for (int j = l; j <= r; j++) {
                if (A[j] % 2 == 0) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

    public static int[] solve(int[] A, int[][] Q) {
        int n = A.length;
        int m = Q.length;
        int[] psum = new int[n];
        if (A[0] % 2 == 0) {
            psum[0] = 1;
        } else {
            psum[0] = 0;
        }
        for (int i = 1; i < n; i++) {
            if (A[i] % 2 == 0) {
                psum[i] = psum[i-1] + 1;
            }else{
                psum[i] = psum[i-1];
            }
        }
        int[] arr = new int[m];
        for(int i = 0; i < m; i++){
            int l = Q[i][0];
            int r = Q[i][1];
            if(l==0){
                arr[i] = psum[r];
            }else{
                arr[i] = psum[r] - psum[l-1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] b = {{0, 2}, {2, 4}, {1, 4}};
        int[] B = {2, 1, 8, 3, 9, 6};
        int[][] C = {{0, 3}, {3, 5}, {1, 3}, {2, 4}};
        System.out.println(Arrays.toString(solve(A,b)));
//        System.out.println(Arrays.toString(bruteforce(A, b)));
//        System.out.println(Arrays.toString(bruteforce(B, C)));

    }
}
