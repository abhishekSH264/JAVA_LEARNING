package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Koko_Eating_Bananas {
    public static boolean ispossible(int[] A, int x, int H) {
        int n = A.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum+=(int)Math.ceil((double)A[i] / x);
        }
        return sum <= H;
    }

    public static int bruteforce(int[] A, int H) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for (int i : A) {
            if (i > max) max = i;
        }

        for (int i = 1; i <= max; i++) {
            if (ispossible(A, i, H)) {
                return i;
            }
        }
        return max;
    }
    public static int solve(int[]A,int K){
        int n = A.length;
        int max = Integer.MIN_VALUE;

        for(int i : A){
            if(i > max) max = i;
        }
        int start = 1, end = max;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if(ispossible(A,mid,K)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {7, 15, 6, 3};
        int h = 8;
        int[] b = {805306368, 805306368, 805306368};
        int K = 1000000000;
        System.out.println(bruteforce(A, h));
        System.out.println(solve(b, K));
    }
}
