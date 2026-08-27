package CLASS.DSA_MODULE_2.DSA_Searching_2_Binary_Search_on_Answer;

public class Special_Integer {

    public static int bruteforce(int[] A, int B) {
        int ans = -1;
        int n = A.length;

        for (int i = 1; i <= n; i++) {
            if (isPossible(A, i, B)) {
                ans = i;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] A, int x, int B) {
        int n = A.length;
        long sum = 0;

        for (int i = 0; i < x; i++) {
            sum += A[i];
        }
        if (sum > B) {
            return false;
        }
        int start = 1, end = x;
        while (end < n) {
            sum = sum - A[start - 1] + A[end];
            if (sum > B) {
                return false;
            }
            end++;
            start++;
        }
        return true;
    }

    public static int solve(int[] A, int K) {
        int n = A.length;
        int start = 1, end = n, ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(A, mid, K)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 10;
        System.out.println(bruteforce(A, B));
        System.out.println(solve(A, B));
    }
}
