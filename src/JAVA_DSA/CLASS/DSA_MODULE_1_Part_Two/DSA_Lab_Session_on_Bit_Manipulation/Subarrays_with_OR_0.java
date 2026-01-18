package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Bit_Manipulation;

public class Subarrays_with_OR_0 {
    public static int solve(int[] A) {
        int n = A.length;
        int ans = 0;
        int ze = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                ze++;
            } else {
                ans += ze*(ze+1)/2;
                ze = 0;
            }
        }
        ans += ze*(ze+1)/2;
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {0, 0, 1, 1, 0};
        System.out.println(solve(A));
    }
}
