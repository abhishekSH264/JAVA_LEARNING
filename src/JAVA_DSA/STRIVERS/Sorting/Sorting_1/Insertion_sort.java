package STRIVERS.Sorting.Sorting_1;

import java.util.Arrays;

public class Insertion_sort {
    public static int[] solve(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && A[j-1] > A[j]) {
                int temp = A[j];
                A[j] = A[j - 1];
                A[j - 1] = temp;
                j--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(solve(A)));
    }
}
