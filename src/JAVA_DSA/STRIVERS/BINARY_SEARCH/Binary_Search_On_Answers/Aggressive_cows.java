package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

import java.util.Arrays;

public class Aggressive_cows {
    public static int bruteforce(int[] A, int K) {
        int n = A.length;
        Arrays.sort(A);
        int max = A[n - 1] - A[0];
        int ans = -1;

        for (int i = 1; i <= max; i++) {
            if (isPossible(A, i, K)) {
                ans = i;
            }
        }
        return ans;
    }

    public static int solve(int[] A, int K) {
        int n = A.length;
        Arrays.sort(A);
        int max = A[n - 1] - A[0];
        int start = 1, end = max, ans = -1;
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
    public static boolean isPossible(int[] A, int x, int K) {
        int n = A.length;
        int cows = 1;
        int cur = A[0];

        for (int i = 1; i < n; i++) {
            if(A[i] - cur >= x){
                cows++;
                cur = A[i];
            }
        }
        return cows >= K;
    }

    public static void main(String[] args) {
        int[] A = {0, 3, 4, 7, 10, 9};
        int K = 4;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A, K));
    }
}
