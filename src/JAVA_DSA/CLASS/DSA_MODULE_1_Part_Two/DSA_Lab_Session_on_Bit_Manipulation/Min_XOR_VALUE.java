package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Bit_Manipulation;

import java.util.Arrays;

public class Min_XOR_VALUE {
    public static int bruteForce(int[] A) {
        int n = A.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int xor = A[i] ^ A[j];
                ans = Math.min(ans, xor);
            }
        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            int xor = A[i] ^ A[i + 1];
            ans = Math.min(ans,xor);
        }
        return ans;
    }

    static void main() {
        int[] A = {0, 2, 5, 7};
        System.out.println(bruteForce(A));
        System.out.println(solve(A));
    }
}
