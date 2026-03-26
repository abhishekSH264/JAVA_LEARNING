package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

import java.util.Arrays;

public class Aggressive_cows {
    public static int bruteforce(int[] A, int K) {
        Arrays.sort(A);
        int n = A.length;
        int max = A[n - 1] - A[0];
        int ans = 0;
        for (int i = 1; i <= max; i++) {
            if (isPossible(A, i, K)) {
                ans = i;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] A, int x, int K) {
        int n = A.length;
        int cur = A[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if(A[i] - cur >= x){
                count++;
                cur = A[i];
            }
        }
        return count >= K;
    }
    public static int solve(int[]A,int K){
        Arrays.sort(A);
        int n = A.length;
        int start = 1, end = A[n-1] - A[0],ans = -1;
        if(K == 2){
            return end;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(isPossible(A,mid,K)){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {0, 3, 4, 7, 10, 9};
        int K = 4;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A,K));
    }
}
