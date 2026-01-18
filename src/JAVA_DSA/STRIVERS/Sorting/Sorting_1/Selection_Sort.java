package STRIVERS.Sorting.Sorting_1;

import java.util.Arrays;

public class Selection_Sort {
    public static int[] solve(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if(A[j] < A[min]){
                    min  = j;
                }
            }
            if(min!=i){
                int temp = A[i];
                A[i] = A[min];
                A[min] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(solve(A)));
    }
}
