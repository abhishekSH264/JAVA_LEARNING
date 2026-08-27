package CLASS.DSA_MODULE_2.DSA_Searching_2_Binary_Search_on_Answer;

public class Painter_Partition_2 {
    public static int bruteforce(int[] A, int K) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        long sum = 0;

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

    public static boolean isPossible(int[] A, long x, int K) {
        int n = A.length;
        int book = 1;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum + A[i] > x) {
                book++;
                sum = A[i];
            } else {
                sum += A[i];
            }
        }
        return book <= K;
    }

    public static int solve(int[] A, int K) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        for (int i : A) {
            if (i > max) max = i;
            sum += i;
        }
        long start = max, end = sum, ans = -1;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isPossible(A, mid, K)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int K = 3;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A, K));
    }
}
