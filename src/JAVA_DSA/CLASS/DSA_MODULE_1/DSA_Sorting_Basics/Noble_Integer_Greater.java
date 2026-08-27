package CLASS.DSA_MODULE_1.DSA_Sorting_Basics;

import java.util.Arrays;

public class Noble_Integer_Greater {
    public static void reverse(int[] A) {
        int n = A.length;
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }

    public static int nobel(int[] A) {
        int n = A.length;
        int noble = 0, count = 0;
        if (A[0] == 0) {
            noble++;
        }
        for (int i = 1; i < n; i++) {
            if(A[i] != A[i-1]){
                count = i;
            }
            if(count == A[i]){
                noble++;
            }
        }
        return noble;
    }

    public static int solve(int[] A) {
        Arrays.sort(A);
        reverse(A);
        return nobel(A);
    }

    public static void main(String[] args) {
        int[] A = {3, 2, 1, 3};
        System.out.println(solve(A));
    }
}
