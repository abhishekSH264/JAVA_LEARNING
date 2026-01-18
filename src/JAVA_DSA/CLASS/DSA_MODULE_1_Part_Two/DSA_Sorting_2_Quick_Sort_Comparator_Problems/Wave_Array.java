package CLASS.DSA_MODULE_1_Part_Two.DSA_Sorting_2_Quick_Sort_Comparator_Problems;

import java.util.Arrays;

public class Wave_Array {
    public static int[] solve(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i+=2) {
            int temp = A[i];
            A[i] = A[i-1];
            A[i-1] = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println(Arrays.toString(solve(A)));
    }
}
