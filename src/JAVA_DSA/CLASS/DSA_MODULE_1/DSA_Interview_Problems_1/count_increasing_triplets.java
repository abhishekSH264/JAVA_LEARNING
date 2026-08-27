package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

public class count_increasing_triplets {
    public static int solve(int[] A) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;

        for (int j = 0; j < n; j++) {
            int left = 0;
            for (int i = 0; i < j; i++) {
                if (A[i] < A[j]) {
                    left++;
                }
            }
            int right = 0;
            for (int i = j + 1; i < n; i++) {
                if(A[i] > A[j]){
                    right++;
                }
            }
            int sum = left * right;
            ans = Math.max(ans,sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 3};
        System.out.println(solve(A));

    }
}
