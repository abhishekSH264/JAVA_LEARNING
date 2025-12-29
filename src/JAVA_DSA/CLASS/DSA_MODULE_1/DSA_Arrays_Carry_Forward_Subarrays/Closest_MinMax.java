package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Closest_MinMax {
    public static int bruteForce(int[] A) {
        int n = A.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : A) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            boolean ismax = false;
            boolean ismin = false;
            for (int j = i; j < n; j++) {
                if (A[j] == max) ismax = true;
                if (A[j] == min) ismin = true;
                if (ismax && ismin) {
                    length = Math.min(length, j - i + 1);
                    break;
                }
            }
        }
        return length;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : A) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        int ans = Integer.MAX_VALUE;
        int lastMin = -1;
        int lastMax = -1;
        for (int i = 0; i < n; i++) {
            if (A[i] == min) {
                lastMin = i;
                if (lastMax != -1) {
                    ans = Math.min(ans, i - lastMax + 1);
                }
            }
            if (A[i] == max) {
                lastMax = i;
                if (lastMin != -1) {
                    ans = Math.min(ans, i - lastMin + 1);
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
