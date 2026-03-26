package CLASS.DSA_MODULE_3.DSA_Searching_2_Binary_Search_on_Answer;

public class Special_Integer {
    public static boolean ispossible(int[] A, int mid, int k) {
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < mid; i++) {
            sum += A[i];
        }
        if (sum > k) {
            return false;
        }
        int start = 1;
        int end = mid;
        while (end < n) {
            sum = sum - A[start - 1] + A[end];
            if (sum > k) return false;
            start++;
            end++;
        }
        return true;
    }

    public static int solve(int[] A, int B) {
        int n = A.length;
        int start = 1;
        int end = n;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ispossible(A, mid, B)) {
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
        System.out.println(solve(A, B));
    }
}
