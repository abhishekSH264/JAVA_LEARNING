package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Closest_MinMax {
    public static int bruteforce(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : A) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                boolean isMax = false;
                boolean isMin = false;
                int length = j - i + 1;
                for (int k = i; k <= j; k++) {
                    if (A[k] == max) {
                        isMax = true;
                    }
                    if (A[k] == min) {
                        isMin = true;
                    }
                }
                if (isMax && isMin) {
                    ans = Math.min(ans, length);
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
        int isMax = -1;
        int isMin = -1;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (A[i] == max) {
                isMax = i;
                if (isMin != -1) {
                    ans = Math.min(ans, (isMax - isMin + 1));
                }
            }
            if (A[i] == min) {
                isMin = i;
                if (isMax != -1) {
                     ans = Math.min(ans,(isMin - isMax + 1));
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2, 6, 1, 6, 9};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
