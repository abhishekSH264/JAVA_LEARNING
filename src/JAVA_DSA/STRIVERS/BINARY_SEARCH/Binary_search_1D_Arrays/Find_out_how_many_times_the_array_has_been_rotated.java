package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Find_out_how_many_times_the_array_has_been_rotated {
    //Bruteforce
    public static int bruteforce(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            if(A[i-1] > A[i]){
                return i;
            }
        }
        return 0;
    }
    public static int solve(int[]A){
        int n = A.length;
        int start = 0,end = n-1,ans = Integer.MAX_VALUE,index = -1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(A[start]<=A[mid]){
                if(A[start] < ans){
                    ans = A[start];
                    index = start;
                }
                start = mid+1;
            }else{
                if(A[mid]<ans){
                    ans = A[mid];
                    index = mid;
                }
                end = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] A = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
