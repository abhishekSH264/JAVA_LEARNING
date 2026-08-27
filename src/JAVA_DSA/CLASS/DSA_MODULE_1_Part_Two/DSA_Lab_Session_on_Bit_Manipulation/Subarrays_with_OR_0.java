package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Bit_Manipulation;

public class Subarrays_with_OR_0 {
    public static int bruteForce(int[] A) {
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int a = 0;
                for (int k = i; k <= j; k++) {
                    a = a | A[k];
                }
                if (a == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int ans = 0;
        int ze = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 1) {
                ans += ze * (ze + 1) / 2;
                ze = 0;
            } else {
                ze++;
            }
        }
        ans += ze * (ze + 1) / 2;
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {0, 0, 1, 1, 0};
        System.out.println(bruteForce(A));
        System.out.println(solve(A));

    }
}
