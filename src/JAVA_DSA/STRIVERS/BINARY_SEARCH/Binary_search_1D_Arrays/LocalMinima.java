package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class LocalMinima {
    //Bruteforce
    public static int bruteforce(int[] A) {
        int n = A.length;
        if (A[0] < A[1]) {
            return A[0];
        } else if (A[n - 1] < A[n - 2]) {
            return A[n - 1];
        }

        for (int i = 1; i < n - 1; i++) {
            if (A[i] < A[i - 1] && A[i] < A[i + 1]) {
                return A[i];
            }
        }
        return -1;
    }

    public static int solve(int[] A) {
        int n = A.length;

        if (A[0] < A[1]) {
            return A[0];
        } else if (A[n - 1] < A[n - 2]) {
            return A[n - 1];
        }
        int start = 1, end = n - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] < A[mid - 1] && A[mid] < A[mid + 1]) {
                return A[mid];
            } else if (A[mid] > A[mid - 1] && A[mid] < A[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {11, 10, 3, 4, 5, 7, 9};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));

    }
}
