package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

import java.security.PublicKey;

public class Painter_Partition {
    public static int brutforce(int[] A, int K) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i : A) {
            if (i > max) max = i;
            sum += i;
        }
        if(K==1) {
            return sum;
        }
        for (int i = max; i <= sum; i++) {
            if(isPossible(A,i,K)){
                return i;
            }
        }
        return max;
    }
    public static boolean isPossible(int[]A,int x,int K){
        int n = A.length;
        int need = 1;
        int sum = 0;

        for(int i = 0; i < n; i ++){
            if(sum + A[i] > x){
                need++;
                sum = A[i];
            }else{
                sum+=A[i];
            }
        }
        return need <= K;
    }
    public static int solve(int[]A,int K){
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i : A) {
            if (i > max) max = i;
            sum += i;
        }
        if(K==1) {
            return sum;
        }

        int start = max,end = sum, ans = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(isPossible(A,mid,K)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40};
        int K = 2;
        System.out.println(brutforce(A, K));
        System.out.println(solve(A, K));
    }
}
