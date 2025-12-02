package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Minimum_days_to_make_M_bouquets {
    public static int brute(int[] A, int m, int K) {
        int n = A.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : A) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        for (int i = min; i <= max; i++) {
            if (isPossible(A, i, m, K)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPossible(int[] A, int x, int m, int k) {
        int n = A.length;
        int count = 0, bloomday = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] > x) {
                bloomday += count / k;
                count = 0;
            } else {
                count++;
            }
        }
        bloomday += count / k;
        return bloomday >= m;
    }
    public static int solve(int[]A,int m,int K){
        int n = A.length;
        if((long)m * K > n) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : A){
            if(i > max) max = i;
            if(i < min) min = i;
        }
        int start = min, end = max, ans = -1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if(isPossible(A,mid,m,K)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2;
        int k = 3;
        System.out.println(brute(A, m, k));
        System.out.println(solve(A,m,k));
    }
}
