package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static int bruteforce(int[] A, int K) {
        int max = Integer.MIN_VALUE;

        for (int i : A) {
            if (i > max) max = i;
        }
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (isPossible(A, i, K)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPossible(int[] A, int x, int K) {
        int n = A.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum +=(int)Math.ceil((double)A[i] / x);
        }
        return sum <= K;
    }
    public static int solve(int[]A,int K){
        int max = Integer.MIN_VALUE;
        for(int i : A){
            if(i > max) max = i;
        }
        int ans = -1;
        int start = 1, end = max;
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
        int[] A = {1, 2, 3, 4, 5};
        int K = 8;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A, K));
    }
}
