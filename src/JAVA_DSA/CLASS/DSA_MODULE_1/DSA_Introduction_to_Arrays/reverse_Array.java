package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

import java.util.Arrays;

public class reverse_Array {
    public static int[] solve(int[] A) {
        int n = A.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
        return A;
    }


    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(solve(A)));
    }
}
