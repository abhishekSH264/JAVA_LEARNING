package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Book_allocation_Problem {
    public static int bruteforce(int[] A, int K) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : A) {
            if (i > max) max = i;
            sum += i;
        }
        for (int i = max; i <= sum; i++) {
            if (isPossible(A, i, K)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPossible(int[] A, int x, int K) {
        int n = A.length;
        int count = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum + A[i] > x) {
                count++;
                sum = A[i];
            } else {
                sum += A[i];
            }
        }
        return count <= K;
    }

    public static int solve(int[] A, int K) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : A) {
            if (i > max) max = i;
            sum += i;
        }
        int start = max, end = sum, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(A, mid, K)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {25, 46, 28, 49, 24};
        int K = 4;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A, K));
    }
}
