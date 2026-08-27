package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

public class Subarray_with_given_sum_and_length {
    public static int bruteforce(int[] A, int B, int C) {
        int n = A.length;
        for (int i = 0; i <= n - B; i++) {
            int sum = 0;
            for(int j = i; j < i + B; j++){
                sum+=A[j];
            }
            if(sum == C){
                return 1;
            }
        }
        return 0;
    }
    public static int solve(int[]A,int B,int C){
        int n = A.length;
        int sum = 0;
        int i = 0, j = 0;

        while (j < n){
            sum+=A[j];
            int len = j - i + 1;
            if(len < B){
                j++;
            }else if(len == B){
                if(sum == C){
                    return 1;
                }
                sum -= A[i];
                i++;
                j++;
            }
        }
        return 0;
    }
    public static int solve1(int[]A,int B,int C){
        int n = A.length;
        int sum = 0;

        //calculating the first window sum
        for(int i = 0; i < B; i++){
            sum+=A[i];
        }
        if(sum == C){
            return 1;
        }
        int start = 1, end = B;
        while (end < n){
            sum = sum - A[start-1] + A[end];
            if(sum == C){
                return 1;
            }
            start++;end++;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {4, 3, 2, 6, 1};
        int B = 3;
        int C = 11;
        System.out.println(bruteforce(A, B, C));
        System.out.println(solve(A, B, C));
        System.out.println(solve1(A, B, C));
    }
}
