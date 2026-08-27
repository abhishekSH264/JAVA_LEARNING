package CLASS.DSA_MODULE_2.DSA_Searching_2_Binary_Search_on_Answer;

import java.sql.SQLOutput;

public class Allocate_Books {
    public static int bruteforce(int[] A, int B) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for (int i : A) {
            if (i > max) max = i;
            sum += i;
        }
        for (int i = max; i <= sum; i++) {
            if (isPossible(A, i, B)) {
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

    public static int solve(int[] A, int B) {
        int n = A.length;
        int min = Integer.MAX_VALUE;
        long sum = 0;

        for (int i : A) {
            if (i < min) min = i;
            sum += i;
        }
        long start = min, end = sum, ans = -1;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isPossible(A, mid, B)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        int[] A = {12, 34, 67, 90};
        int B = 2;
        System.out.println(bruteforce(A, B));
        System.out.println(solve(A, B));
    }
}
