package CLASS.DSA_MODULE_2.DSA_Lab_Session_on_Binary_Searching;

import java.util.Arrays;

public class Matrix_median {
    public static int bruteforce(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[] arr = new int[n * m];
        int K = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[K++] = A[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }

    public static int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            min = Math.min(A[i][0], min);
            max = Math.max(A[i][m - 1], max);
        }
        int desired = (n * m + 1) / 2;

        int start = min, end = max, ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0;

            for (int i = 0; i < n; i++) {
                count += findSmaller(A[i], mid);
            }

            if (count >= desired) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int findSmaller(int[] A, int K) {
        int n = A.length;
        int start = 0, end = n - 1, ans = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > K) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static void main() {
        int[][] A = {{1, 5, 7, 9, 11}, {2, 3, 4, 5, 10}, {9, 10, 12, 14, 16}};
        int[][] B = {{1,3,5},{2,6,9},{3,6,9}};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
        System.out.println(bruteforce(B));
        System.out.println(solve(B));
    }
}
