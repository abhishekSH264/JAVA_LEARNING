package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Arrays;

import java.util.Arrays;

public class Next_Permutation {
    public static void reverse(int[] A, int start, int end) {
        int i = start;
        int j = end;

        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        int dip = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                dip = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if(A[i] > A[dip]){
                int temp = A[i];
                A[i] = A[dip];
                A[dip] = temp;
                break;
            }
        }
        reverse(A,dip+1,n-1);
        return A;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {1, 6, 2, 3, 4, 5, 7, 8};
        int[] C = {1, 3, 5, 4, 2};
        System.out.println(Arrays.toString(solve(A)));
        System.out.println(Arrays.toString(solve(B)));
        System.out.println(Arrays.toString(solve(C)));
    }
}
