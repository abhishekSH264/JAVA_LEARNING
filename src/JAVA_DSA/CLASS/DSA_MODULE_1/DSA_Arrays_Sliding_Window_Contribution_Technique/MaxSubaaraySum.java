package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

public class MaxSubaaraySum {
    public static int bruteforce(int A, int B, int[] C) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < A; i++) {
            for (int j = i; j < A; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += C[k];
                }
                if (sum <= B) {
                    ans = Math.max(ans, sum);
                }
            }
        }
        return ans;
    }

    public static int carryforward(int A, int B, int[] C) {
        int n = A;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += C[j];
                if (sum <= B) {
                    ans = Math.max(ans, sum);
                }
            }
        }
        return ans;
    }

    public static int betterSolution(int A, int B, int[] C) {
        int n = A;
        int ans = Integer.MIN_VALUE;

        int[] prefix = new int[n];
        prefix[0] = C[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + C[i];
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if(i == 0){
                    sum = prefix[j];
                }else{
                    sum = prefix[j] - prefix[i-1];
                }
                if(sum <= B){
                    ans = Math.max(ans,sum);
                }
            }
        }
        return ans;
    }
    public static int solve(int A,int B,int[]C){
        int n = A;
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while (j < n){
            sum+=C[j];
            while (sum > B){
                sum -=C[i];
                i++;
            }
            ans = Math.max(ans,sum);
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] C = {2, 1, 3, 4, 5};
        int A = C.length;
        int B = 12;
        System.out.println(bruteforce(A, B, C));
        System.out.println(carryforward(A, B, C));
        System.out.println(betterSolution(A, B, C));
        System.out.println(solve(A, B, C));
    }
}
