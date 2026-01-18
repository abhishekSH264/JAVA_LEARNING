package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Sum_of_odd_number_in_a_range {

    public static int[] bruteforce(int[] A, int[][] Q) {
        int n = A.length;
        int m = Q.length;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            int start = Q[i][0];
            int end = Q[i][1];
            int sum = 0;
            for (int j = start; j <= end; j++) {
                if (A[j] % 2 != 0) {
                    sum += A[j];
                }
            }
            arr[i] = sum;
        }
        return arr;
    }

    public static int[] solve(int[] A, int[][] Q) {
        int n = A.length;
        int m = Q.length;

        int[] oSum = new int[n];
        if (A[0] % 2 != 0) {
            oSum[0] = A[0];
        }else{
            oSum[0] = 0;
        }
        for(int i = 1; i < n; i++){
            if(A[i] %2!=0){
                oSum[i] = oSum[i-1]+A[i];
            }else{
                oSum[i] = oSum[i-1];
            }
        }
        int[] arr = new int[m];
        for(int i = 0; i < m; i++){
            int start = Q[i][0];
            int end = Q[i][1];
            if(start==0){
                arr[i] = oSum[end];
            }else{
                arr[i] = oSum[end] - oSum[start-1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] A = {3, 2, 7, 4, 9, 6};
        int[][] B = {{0, 3}, {1, 5}, {2, 4}};
        System.out.println(Arrays.toString(bruteforce(A, B)));
        System.out.println(Arrays.toString(solve(A,B)));

    }
}
