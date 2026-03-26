package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static int bruteforce(int[] A, int k) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (isPossible(A, i, k)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPossible(int[] A, int x, int k) {
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.ceil((double)A[i] / x);
        }
        return sum <= k;
    }
    public static int solve(int[]A,int k){
        int n = A.length;
        int start = 0,end = n-1,ans = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(isPossible(A,mid,k)){
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
