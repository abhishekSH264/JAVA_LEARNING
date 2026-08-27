package STRIVERS.Arrays;

import java.util.Arrays;

public class left_Rotate_array_by_K_elements {
    public static void reverse(int[] A, int si, int en) {
        int i = si;
        int j = en;

        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;j--;
        }
    }
    public static int[] solve(int[]A,int K){
        int n = A.length;
        K = K % n;

        reverse(A,0,K-1);
        reverse(A,K,n-1);
        reverse(A,0,n-1);
        return A;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7};
        int K = 2;
        System.out.println(Arrays.toString(solve(A, K)));
    }
}
