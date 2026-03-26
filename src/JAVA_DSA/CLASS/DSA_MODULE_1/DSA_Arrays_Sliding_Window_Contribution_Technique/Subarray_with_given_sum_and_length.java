package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

public class Subarray_with_given_sum_and_length {
    public static int bruteforce(int[]A,int B,int C){
        int n = A.length;
        int start = 0;
        int end = B-1;
        while(end < n){
            long sum = 0;
            for(int i = start; i <= end; i++){
                sum+=A[i];
            }
            if(sum==C){
                return 1;
            }
            start++;end++;
        }
        return 0;
    }
    public static int solve(int[]A,int B,int C){
        int n = A.length;
        long sum = 0;
        for(int i = 0 ; i < B; i++){
            sum+=A[i];
        }
        if(sum==C){
            return 1;
        }
        int start = 1;
        int end = B;
        while(end < n){
            sum  = sum - A[start-1] + A[end];
            if(sum==C){
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
        System.out.println(bruteforce(A,B,C));
        System.out.println(solve(A,B,C));
    }
}
