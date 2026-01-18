package CLASS.DSA_MODULE_1.DSA_Sorting_Basics;

import java.util.Arrays;

public class Noble_Integer_Greater {
    public static int nobel(int[] A) {
        int n = A.length;
        int nobel = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || A[i] != A[i - 1]) {
                count = i;
            }
            if (count == A[i]) {
                nobel++;
            }
        }
        return nobel;
    }

    public static void reverse(int[] A) {
        int n = A.length;
        int i = 0;
        int j = n - 1;

        while (i < j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;j--;
        }
    }

    public static int solve(int[] A) {
        Arrays.sort(A);
        reverse(A);
        int count = nobel(A);
        if(count < 0){
            return 1;
        }
        return -1;
    }
}
