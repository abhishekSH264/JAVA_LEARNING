package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Minimum_in_Rotated_Sorted_Array {
    public static int brute(int[] A) {
        int n = A.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, A[i]);
        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int start = 0, end = n - 1, ans = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(A[start]<=A[mid]){
                ans = Math.min(ans,A[start]);
                start = mid+1;
            }else{
                ans = Math.min(ans,A[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {4, 5, 6, 7, 0, 1, 2, 3};
        int[] B = {3, 1, 2};
        int[] C = {3, 4, 5, 1, 2};
        System.out.println(solve(A));
    }
}
