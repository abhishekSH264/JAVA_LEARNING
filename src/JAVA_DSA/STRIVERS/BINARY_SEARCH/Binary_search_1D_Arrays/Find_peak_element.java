package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Find_peak_element {
    //Bruteforce
    public static int safeGet(int[] A, int i) {
        int n = A.length;
        if (i >= 0 && i < n) {
            return A[i];
        }
        return Integer.MIN_VALUE;
    }

    public static int bruteforce(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] > safeGet(A, i - 1) && A[i] > safeGet(A, i + 1)) {
                return A[i];
            }
        }
        return -1;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] >= safeGet(A, mid - 1) && A[mid] >= safeGet(A, mid + 1)) {
                return A[mid];
            } else if (A[mid] > safeGet(A, mid - 1) && A[mid] < safeGet(A, mid + 1)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
