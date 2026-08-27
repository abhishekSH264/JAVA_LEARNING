package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

import java.util.Arrays;

public class Array_Rotation_LEFT {
    public static int[] bruteforce(int[] A, int K) {
        int n = A.length;
        for (int i = 1; i <= K; i++) {
            int start = A[0];

            for (int j = 1; j < n; j++) {
                A[j-1] = A[j];
            }
            A[n-1] = start;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        //arrays rotate - 3,4,5,6,1,2
        int K = 2;
        System.out.println(Arrays.toString(bruteforce(A, K)));
    }
}
