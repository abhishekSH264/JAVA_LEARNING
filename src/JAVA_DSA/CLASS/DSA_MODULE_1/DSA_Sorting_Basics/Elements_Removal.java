package CLASS.DSA_MODULE_1.DSA_Sorting_Basics;

import java.util.Arrays;

public class Elements_Removal {
    public static void reverse(int[]A){
        int n = A.length;
        int i = 0, j = n - 1;
        while (i < j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }

    public static int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        reverse(A);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (long)A[i] * (i + 1);
        }
        return (int)sum;
    }
    public static void main(String[] args){
        int[] A = {4,6,1};
        System.out.println(solve(A));
    }
}
