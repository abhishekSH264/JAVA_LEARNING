package CLASS.DSA_MODULE_2.DSA_Searching_2_Binary_Search_on_Answer;

public class Painters_Partition_Problem {
    public static int bruteforce(int A, int B, int[] C) {
        int n = C.length;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        for (int i : C) {
            if (i > max) max = i;
            sum += i;
        }
        for (int i = max; i <= sum; i++) {
            if (isPossible(C, i, A)) {
                return i * B;
            }
        }
        return -1;
    }

    public static boolean isPossible(int[] A, long x, int K) {
        int n = A.length;
        int painter = 1;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + A[i] > x) {
                painter++;
                sum = A[i];
            } else {
                sum += A[i];
            }
        }
        return painter <= K;
    }

    public static int solve(int A, int B, int[] C) {
        int n = C.length;
        long sum = 0;
        long max = Integer.MIN_VALUE;

        for (int i : C) {
            if (i > max) max = i;
            sum += i;
        }
        long start = max, end = sum, ans = -1;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isPossible(C, mid, A)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int)((ans * B) % 10000003);
    }

    public static void main(String[] args) {
        int A = 2;
        int B = 5;
        int[] C = {1, 10};
        System.out.println(bruteforce(A, B, C));
        System.out.println(solve(A,B,C));
    }
}
