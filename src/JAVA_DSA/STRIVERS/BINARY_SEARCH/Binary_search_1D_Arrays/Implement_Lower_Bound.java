package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Implement_Lower_Bound {
    public static int bruteforce(int[] A, int x) {
        int n = A.length;
        int ans = n;

        for (int i = 0; i < n; i++) {
            if (A[i] >= x) {
                return i;
            }
        }
        return n;
    }

    public static int solve(int[] A, int x) {
        int n = A.length;
        int start = 0, end = n - 1, ans = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3};
        int x = 5;
        System.out.println(bruteforce(A, x));
        System.out.println(solve(A, x));
    }
}
