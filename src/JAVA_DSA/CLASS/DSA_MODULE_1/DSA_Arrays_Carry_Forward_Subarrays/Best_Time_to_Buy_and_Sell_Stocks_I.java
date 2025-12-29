package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Best_Time_to_Buy_and_Sell_Stocks_I {
    public static int bruteforce(int[] A) {
        int n = A.length;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            int max = A[i];
            for (int j = i + 1; j < n; j++) {
                if (A[j] > max) {
                    max = A[j];
                }
            }
            maxProfit = Math.max(maxProfit, max - A[i]);
        }
        return maxProfit;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int maxProfit = 0;
        int min = A[0];
        for (int i = 1; i < n; i++) {
            int profit = A[i] - min;
            maxProfit = Math.max(maxProfit,profit);
            if(A[i] < min){
                min = A[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 5, 2, 4};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
