package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Minimum_in_Rotated_Sorted_Array {
    //Bruteforce
    public static int bruteforce(int[] A) {
        int n = A.length;
        int index = -1;
        for (int i = 1; i < n; i++) {
            if (A[i - 1] > A[i]) {
                index = i;
                System.out.println(index);
                return A[i];
            }
        }

        return A[0];
    }

    public static int solve(int[] A) {
        int n = A.length;
        int start = 0, end = n - 1, ans = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(A[start] <= A[mid]){
                if(A[start] < ans){
                    ans = A[start];
                }
                start = mid+1;
            }else{
                if(A[mid] < ans){
                    ans = A[mid];
                }
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {4, 5, 6, 7, 0, 1, 2, 3};
        int[] B = {3, 1, 2};
        int[] C = {3, 4, 5, 1, 2};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
