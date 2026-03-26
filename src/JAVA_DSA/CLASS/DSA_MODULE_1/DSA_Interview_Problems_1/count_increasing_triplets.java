package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

public class count_increasing_triplets {
    public static int solve(int[] A) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int left = 0;
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i]) {
                    left++;
                }
            }
            int right = 0;
            for (int k = i+1; k < n; k++) {
                if (A[k] > A[i]) {
                    right++;
                }
            }
            count += left * right;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 3};
        System.out.println(solve(A));

    }
}
