package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Search_Insert_Position {
    public static int bruteforce(int[] A, int K) {
        int n = A.length;
        int ans = n;
        for (int i = 0; i < n; i++) {
            if(A[i]>K){
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static int solve(int[]A,int K){
        int n = A.length;
        int start = 0,end = n-1,ans = n;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(A[mid]>=K){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 7};
        int K = 6;
        System.out.println(bruteforce(A,K));
        System.out.println(solve(A,K));
    }
}
