package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

public class Count_Increasing_triplets {
    public static int solve(int[] A) {
        int n = A.length;
        int sum = 0;
        for (int j = 0; j < n; j++) {
            int left = 0;
            for (int i = 0; i < j; i++) {
                if (A[i] < A[j]) left++;
            }
            int right = 0;
            for (int k = j + 1; k < n; k++) {
                if (A[k] > A[j]) {
                    right++;
                }
            }
            sum += left * right;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 3};
        System.out.println(solve(A));
    }
}
