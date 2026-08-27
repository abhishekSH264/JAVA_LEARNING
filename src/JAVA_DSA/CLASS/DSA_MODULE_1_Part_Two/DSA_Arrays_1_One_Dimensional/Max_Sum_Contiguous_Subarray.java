package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import jdk.jshell.spi.SPIResolutionException;

public class Max_Sum_Contiguous_Subarray {
    public static int bruteforce(int[] A) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

    public static int carryForward(int[] A) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

    public static int prefixArray(int[] A) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;

        int[] prefix = new int[n];
        prefix[0] = A[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=A[i];
            ans = Math.max(ans,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, -10};
        int[] B = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] C = {-2, 3, 4, -1, 5, -10, 7};
        System.out.println(bruteforce(A));
        System.out.println(bruteforce(B));
        System.out.println(bruteforce(C));
        System.out.println(carryForward(A));
        System.out.println(carryForward(B));
        System.out.println(carryForward(C));
        System.out.println(prefixArray(A));
        System.out.println(prefixArray(B));
        System.out.println(prefixArray(C));
        System.out.println(solve(A));
        System.out.println(solve(B));
        System.out.println(solve(C));
    }
}
