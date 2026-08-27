package CLASS.DSA_MODULE_1.DSA_Sorting_Basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Elements_Removal {
    public static int bruteforce(int[] A) {
        int n = A.length;
        int ans = 0;
        Arrays.sort(A);
        reverse(A);
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
            }
            ans += sum;
        }
        return ans;
    }

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

    public static int solve(int[] A) {
        int n = A.length;
        int ans = 0;
        Arrays.sort(A);
        reverse(A);
        for (int i = 0; i < n; i++) {
            ans+=A[i] * (i+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {4, 6, 1};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
