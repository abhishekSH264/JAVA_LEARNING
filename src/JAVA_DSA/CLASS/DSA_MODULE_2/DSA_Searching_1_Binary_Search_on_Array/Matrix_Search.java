package CLASS.DSA_MODULE_2.DSA_Searching_1_Binary_Search_on_Array;

public class Matrix_Search {
    public static int bruteforce(int[][] A, int K) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int m = A[i].length;
            for (int j = 0; j < n; j++) {
                if (A[i][j] == K) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static int solve(int[][] A, int K) {
        int n = A.length;
        int m = A[0].length;

        int row = 0;
        int col = m - 1;
        while (row < n && col >= 0) {
            if (A[row][col] == K) {
                return 1;
            } else if (A[row][col] > K) {
                col--;
            } else {
                row++;
            }
        }
        return 0;
    }

    public static int solve2(int[][] A, int K) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            int m = A[i].length;
            if (A[i][0] <= K && K <= A[i][m - 1]) {
                if (ispresent(A[i], K)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static boolean ispresent(int[] A, int K) {
        int n = A.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == K) {
                return true;
            } else if (A[mid] < K) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static int solve3(int[][] A, int K) {
        int n = A.length;
        int m = A[0].length;
        int start = 0, end = n * m - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / m;
            int col = mid % m;
            if (A[row][col] == K) {
                return 1;
            } else if (A[row][col] < K) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        int K = 3;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A, K));
        System.out.println(solve2(A, K));
        System.out.println(solve3(A, K));

    }
}
