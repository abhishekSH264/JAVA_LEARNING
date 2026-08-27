package STRIVERS.Arrays;

import java.util.Arrays;

public class Left_Rotate_the_Array_by_One {
    public static int[] solve(int[] A) {
        int n = A.length;
        int temp = A[0];
        for (int i = 1; i < n; i++) {
            A[i-1] = A[i];
        }
        A[n-1] = temp;
        return A;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solve(A)));
    }
}
