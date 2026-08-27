package CLASS.DSA_MODULE_2.DSA_Searching_2_Binary_Search_on_Answer;

import java.util.Arrays;

public class Aggressive_cows {
    public static int bruteforce(int[] A, int K) {
        Arrays.sort(A);
        int n = A.length;
        int ans = -1;
        for (int i = 1; i <= A[n - 1] - A[0]; i++) {
            if (isPossible(A, i, K)) {
                ans = i;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] A, int x, int K) {
        int n = A.length;
        int cows = 1;
        int cur = A[0];

        for (int i = 1; i < n; i++) {
            if (A[i] - cur >= x) {
                cows++;
                cur = A[i];
            }
        }
        return cows >= K;
    }
    public static int solve(int[]A,int K){
        Arrays.sort(A);
        int n = A.length;
        int start = 1, end = A[n-1] - A[0];
        int ans = -1;

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
        int[] A = {1, 2, 3, 4, 5};
        int B = 3;
        int[] c = {5, 17, 100, 11};
        int D = 2;
        System.out.println(bruteforce(A, B));
        System.out.println(solve(A,B));
    }
}
