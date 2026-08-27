package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

import javax.lang.model.element.AnnotationMirror;

public class Find_out_how_many_times_the_array_has_been_rotated {
    public static int bruteforce(int[] A) {
        int n = A.length;

        for (int i = 1; i < n; i++) {
            if(A[i] < A[i-1]){
                return i;
            }
        }
        return 0;
    }
    public static int solve(int[]A){
        int n = A.length;
        int start = 0, end = n-1;
        int idx = -1;
        int ans = Integer.MAX_VALUE;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(A[start] <= A[mid]){
                if(ans > A[start]){
                    ans = A[start];
                    idx = start;
                }
                start = mid+1;
            }else{
                if(ans > A[mid]){
                    ans = A[mid];
                    idx = mid;
                }
                end = mid-1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] A = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
