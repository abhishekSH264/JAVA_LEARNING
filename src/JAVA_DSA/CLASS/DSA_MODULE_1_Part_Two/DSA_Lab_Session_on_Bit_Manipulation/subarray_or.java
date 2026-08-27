package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Bit_Manipulation;

public class subarray_or {
    public static int bruteforce(int[] A) {
        int n = A.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int a = 0;
            for (int j = i; j < n; j++) {
                a = a | A[j];
                ans += (a % 1000000007);
            }
        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        long total = (long) n * (n + 1) / 2;
        long ans = 0;
        int MOD = 1000000007;

        for (int i = 0; i < 32; i++) {
            long ze = 0;
            long zerSub = 0;

            for (int j = 0; j < n; j++) {
                if ((A[j] & (1 << i)) > 0) {
                    zerSub += ze * (ze + 1) / 2;
                    ze = 0;
                } else {
                    ze++;
                }
            }
            zerSub += ze * (ze + 1) / 2;
            long totalOnes = total - zerSub;
            ans = (ans + (totalOnes * (1L << i)) % MOD) % MOD;
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
