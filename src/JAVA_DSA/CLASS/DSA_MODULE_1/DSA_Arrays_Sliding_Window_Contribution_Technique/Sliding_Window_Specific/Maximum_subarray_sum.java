package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique.Sliding_Window_Specific;

public class Maximum_subarray_sum {
    //Extreme BruteForce
    public static int bruteforce(int[] A, int K) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int len = j - i + 1;
                if (len == K) {
                    int sum = 0;
                    for (int k = i; k <= j; k++) {
                        sum += A[k];
                    }
                    ans = Math.max(ans, sum);
                }
            }
        }
        return ans;
    }

    //BruteForce Approach using the better Approach
    public static int better(int[] A, int B) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i <= n - B; i++) {
            int sum = 0;
            for (int j = i; j < i + B; j++) {
                sum += A[j];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    //Using the Fixed Window Approach
    public static int solve(int[] A, int K) {
        int n = A.length;
        long sum = 0;
        for (int i = 0; i < K; i++) {
            sum += A[i];
        }
        long ans = sum;
        int start = 1, end = K;

        while (end < n) {
            sum = sum - A[start - 1] + A[end];
            ans = Math.max(ans, sum);
            start++;
            end++;
        }
        return (int) ans;
    }

    //Two Pointer approach for the sliding window
    public static int solve1(int[] A, int K) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;
        int i = 0, j = 0;
        int sum = 0;
        while (j < n){
            sum+=A[j];
            int len = j - i + 1;
            if(len < K){
                j++;
            }else if(len == K){
                ans = Math.max(ans,sum);
                sum -= A[i];
                i++;j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 1, 8, 2, 9, 1};
        int B = 3;
        System.out.println(bruteforce(A, B));
        System.out.println(better(A, B));
        System.out.println(solve(A, B));
        System.out.println(solve1(A,B));
    }
}
