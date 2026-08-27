package STRIVERS.Sorting.Sorting_1;

import java.util.Arrays;

public class Bubble_Sort {
    public static int[] solve(int[]A){
        int n = A.length;
        for(int i = n-1; i > 0; i--){
            boolean swapped = false;
            for(int j = 0; j < i; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int[] A = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(solve(A)));
    }
}
