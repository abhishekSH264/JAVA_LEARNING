package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

public class max_consecutive_ones_replacing {
    public static int solve(int[] A) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;
        int totalOne = 0;
        for (int i = 0; i < n; i++) {
            if(A[i] == 1){
                totalOne++;
            }
        }
        if(totalOne == n){
            return n;
        }
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                int l = i - 1;
                int leftCount = 0;
                while (l >= 0 && A[l] == 1) {
                    leftCount++;
                    l--;
                }
                int r = i + 1;
                int rightCount = 0;
                while (r < n && A[r] == 1) {
                    rightCount++;
                    r++;
                }
                int sum = leftCount + rightCount + 1;
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 0, 1, 1, 0, 1, 1, 1};
        System.out.println(solve(A));
    }
}
