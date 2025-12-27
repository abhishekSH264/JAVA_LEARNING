package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

import java.util.Arrays;

public class Array_Rotation_RIGHT {
    //Bruteforce
    public static int[] bruteforce(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < K; i++) {
            int last = A[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                A[j + 1] = A[j];
            }
            A[0] = last;
        }
        return A;
    }
    public static void reverse(int[]A,int i,int j){
        while (i < j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;j--;
        }
    }
    public static int[] solve(int[] A, int K) {
        int n = A.length;
        reverse(A,0,n-1);
        System.out.println(Arrays.toString(A));
        reverse(A,0,K-1);
        System.out.println(Arrays.toString(A));
        reverse(A,K,n-1);
        System.out.println(Arrays.toString(A));
        return A;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7};
        int b = 3;
//        System.out.println(Arrays.toString(bruteforce(A, b)));
        System.out.println(Arrays.toString(solve(A,b)));
    }
}
