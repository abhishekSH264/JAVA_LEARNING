package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Bit_Manipulation;

public class Subarrays_with_OR_1 {
    public static int solve(int[] A) {
        int n = A.length;
        int totalsubarray = n * (n + 1) / 2;
        int ans = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                m++;
            } else {
                ans += m * (m + 1) / 2;
                m = 0;
            }
        }
        ans += m * (m + 1) / 2;
        return totalsubarray - ans;

    }

    public static void main(String[] args) {
        int[] A = {0, 0, 1, 1, 0};
        System.out.println(solve(A));
    }
}
