package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Kth_Missing_Positive_Number {
    public static int bruteforce(int[] A, int K) {
        int n = A.length;
        int i = 0;
        int num = 1;
        while (i < n && K > 0) {
            if (num == A[i]) {
                i++;
            } else {
                K--;
            }
            num++;
        }
        if (K > 0) {
            return A[n - 1] + K;
        }
        return num - 1;
    }

    public static int solve(int[] A, int K) {
        int max = Integer.MIN_VALUE;
        int n = A.length;
        for (int i : A) {
            if (i > max) max = i;
        }
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int missing = A[mid] - mid - 1;
            if (missing < K) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end + K + 1;
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 4, 7, 11};
        int K = 5;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A, K));
    }
}
