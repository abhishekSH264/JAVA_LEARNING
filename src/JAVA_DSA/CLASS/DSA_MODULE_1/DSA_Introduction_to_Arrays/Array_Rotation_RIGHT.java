package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

import java.util.Arrays;

public class Array_Rotation_RIGHT {
    public static int[] bruteforce(int[] A, int K) {
        int n = A.length;
        for (int i = 1; i <= K; i++) {
            int last = A[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                A[j + 1] = A[j];
            }
            A[0] = last;
        }
        return A;
    }

    public static void reverse(int[] A, int i, int j) {
        while (i < j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;j--;
        }
    }
    public static int[] rotate(int[]A,int K){
        int n = A.length;
        K = K % n;

        reverse(A,0,n-1);
        reverse(A,0,K-1);
        reverse(A,K,n-1);
        return A;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7};
        int b = 3;
//        System.out.println(Arrays.toString(bruteforce(A, b)));
        System.out.println(Arrays.toString(rotate(A,b)));
    }
}
