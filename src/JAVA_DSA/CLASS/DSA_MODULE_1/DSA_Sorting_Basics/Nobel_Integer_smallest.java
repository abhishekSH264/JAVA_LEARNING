package CLASS.DSA_MODULE_1.DSA_Sorting_Basics;

import java.util.Arrays;

public class Nobel_Integer_smallest {
    public static int bruteforce(int[] A) {
        int n = A.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (A[j] < A[i]) {
                    count++;
                }
            }
            if (A[i] == count) {
                ans++;
            }
        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(i == A[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, -5, 3, 5, -10, 4};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
