package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Implement_Upper_Bound {
    public static int bruteforce(int[] A, int K) {
        int n = A.length;
        int ans = n;
        for (int i = 0; i < n; i++) {
            if (A[i] > K) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static int solve(int[] A, int K) {
        int n = A.length;
        int low = 0, high = n - 1, ans = n;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(A[mid] > K){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {3, 5, 8, 15, 19};
        int x = 9;
        System.out.println(bruteforce(A, x));
        System.out.println(solve(A,x));
    }
}
