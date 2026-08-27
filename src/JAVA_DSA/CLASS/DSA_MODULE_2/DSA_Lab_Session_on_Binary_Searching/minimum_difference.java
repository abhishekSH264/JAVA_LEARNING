package CLASS.DSA_MODULE_2.DSA_Lab_Session_on_Binary_Searching;

import java.util.Arrays;

public class minimum_difference {
    public static int bruteforce(int A, int B, int[][] C) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < A - 1; i++) {
            for (int j = 0; j < B; j++) {
                for (int K = 0; K < B; K++) {
                    min = Math.min(Math.abs(C[i][j] - C[i + 1][K]), min);
                }
            }
        }
        return min;
    }

    public static int lowerBound(int[] A, int K) {
        int n = A.length;
        int start = 0, end = n - 1, ans = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] >= K) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int solve(int A, int B, int[][] C) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < A; i++) {
            Arrays.sort(C[i]);
        }

        for (int i = 0; i < A - 1; i++) {
            for (int j = 0; j < B; j++) {
                int val = C[i][j];
                int idx = lowerBound(C[i], val);

                if (idx < B) {
                    ans = Math.min(Math.abs(C[i][j] - C[i + 1][idx]), ans);
                }
                if(idx > 0){
                    ans = Math.min(Math.abs(C[i][j] - C[i+1][idx-1]),ans);
                }
            }
        }
        return ans;
    }

    static void main() {
        int[][] C = {{8, 4}, {6, 8}};
        int A = 2;
        int B = 2;
        System.out.println(bruteforce(A, B, C));
        System.out.println(solve(A, B, C));
    }
}
