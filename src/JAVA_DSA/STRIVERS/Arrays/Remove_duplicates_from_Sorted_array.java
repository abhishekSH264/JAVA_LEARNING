package STRIVERS.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class Remove_duplicates_from_Sorted_array {
    public static int solve(int[] A) {
        int n = A.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(A[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] A = {0, 0, 3, 3, 5, 6};
        System.out.println(solve(A));
    }
}
