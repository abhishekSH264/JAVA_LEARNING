package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Closest_MinMax {

    public static int bruteForce(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : A) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            boolean isMax = false;
            boolean isMin = false;
            for (int j = i; j < n; j++) {
                if (A[j] == max) isMax = true;
                if (A[j] == min) isMin = true;

                if (isMax && isMin) {
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : A) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        int lastmax = -1;
        int lastmin = -1;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (A[i] == min) {
                lastmin = i;
                if (lastmax != -1) {
                    ans = Math.min(ans, lastmin - lastmax + 1);
                }
            }
            if (A[i] == max) {
                lastmax = i;
                if (lastmin != -1) {
                    ans = Math.min(ans, lastmax - lastmin + 1);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {2, 6, 1, 6, 9};
        System.out.println(bruteForce(A));
        System.out.println(solve(A));
    }
}
