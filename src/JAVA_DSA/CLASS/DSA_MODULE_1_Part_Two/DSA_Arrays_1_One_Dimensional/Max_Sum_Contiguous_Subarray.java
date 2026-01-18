package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

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
                if (sum > ans) {
                    ans = sum;
                }
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
        int[] pf = new int[n];
        pf[0] = A[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + A[i];
        }
        //System.out.println(Arrays.toString(pf));
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    sum = pf[j];
                } else {
                    sum = pf[j] - pf[i - 1];
                }
                //System.out.println(sum);
                ans = Math.max(ans, sum);
                //System.out.println(ans);
            }
        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int sum = 0;
        int ans = Integer.MIN_VALUE;
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
        System.out.println(bruteforce(A));
        System.out.println(bruteforce(B));
        System.out.println(carryForward(A));
        System.out.println(carryForward(B));
        System.out.println(prefixArray(A));
        System.out.println(prefixArray(B));
        System.out.println(solve(A));
        System.out.println(solve(B));
    }
}
