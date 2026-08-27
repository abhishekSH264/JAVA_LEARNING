package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Best_Time_to_Buy_and_Sell_Stocks_I {
    public static int bruteforce(int[] A) {
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int max = A[i];
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, A[j]);
            }
            ans = Math.max(ans, max - A[i]);
        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int ans = 0;
        int low = A[0];
        for (int i = 1; i < n; i++) {
            int profit = A[i] - low;
            ans = Math.max(ans,profit);

            if(A[i] < low){
                low = A[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 5, 2, 4};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
