package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

import java.util.Arrays;

public class Aggressive_Cows {
    public static int bruteforce(int[] A, int K) {
        Arrays.sort(A);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : A) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        int ans = -1;
        for (int i = 1; i <= max - min; i++) {
            if (isPossible(A, i, K)) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] A, int x, int K) {
        int n = A.length;
        int cows = 1;
        int last = A[0];

        for (int i = 1; i < n; i++) {
            if (A[i] - last >= x) {
                cows++;
                last = A[i];
            }
        }
        return cows >= K;
    }

    public static int solve(int[] A, int K) {
        int n = A.length;
        Arrays.sort(A);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : A) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        int start = 1, end = max - min, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(A, mid, K)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {0, 3, 4, 7, 10, 9};
        int K = 4;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A, K));
    }
}
