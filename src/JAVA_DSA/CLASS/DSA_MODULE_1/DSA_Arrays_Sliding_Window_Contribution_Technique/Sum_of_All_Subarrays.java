package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

import java.util.Arrays;

public class Sum_of_All_Subarrays {
    //bruteforce
    public static int bruteForce(int[] A) {
        int n = A.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }
                ans += sum;
            }
        }
        return ans;
    }

    public static int CarryForward(int[] A) {
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum+=A[j];
                ans+=sum;
            }
        }
        return ans;
    }
    public static int prefixSum(int[]A){
        int n = A.length;
        int[] psum = new int[n];
        psum[0] = A[0];
        int ans = 0;
        for(int i = 1; i < n; i++){
            psum[i] = psum[i-1]+A[i];
        }

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                if(i==0){
                    sum = psum[j];
                }else{
                    sum = psum[j] - psum[i-1];
                }
                ans+=sum;
            }
        }
        return ans;
    }
    public static long solve(int[]A){
        int n = A.length;
        long sum = 0;
        for(int i = 0 ; i < n; i++){
            long x = (long)(i+1) *(n-i);
             sum += A[i] * x;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(bruteForce(A));
        System.out.println(CarryForward(A));
        System.out.println(prefixSum(A));
        System.out.println(solve(A));
    }
}
