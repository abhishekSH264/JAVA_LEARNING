package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

import java.util.Arrays;

public class Floor_and_Ceil_in_Sorted_Array {

    public static int[] bruteforce(int[] A, int K) {
        int n = A.length;
        int floor = -1;
        for (int i = 0; i < n; i++) {
            if (A[i] <= K) {
                floor = A[i];
            } else {
                break;
            }
        }
        int ceil = -1;
        for (int i = 0; i < n; i++) {
            if (A[i] >= K) {
                ceil = A[i];
                break;
            }
        }
        return new int[]{floor, ceil};
    }

    public static int[] solve(int[] A, int K) {
        int n = A.length;
        int start = 0, end = n - 1, floor = -1, ceil = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(A[mid] <=K){
                floor = A[mid];
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        start = 0;end = n-1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if(A[mid] >=K){
                ceil = A[mid];
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return new int[]{floor,ceil};
    }

    public static void main(String[] args) {
        int[] A = {3, 4, 4, 7, 8, 10};
        int K = 5;
        System.out.println(Arrays.toString(bruteforce(A, K)));
        System.out.println(Arrays.toString(solve(A, K)));
    }
}
