package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

import java.util.Arrays;

public class Find_the_first_or_last_occurrence_of_a_given_number_in_a_sorted_array {
    //Bruteforce
    public static int[] bruteforce(int[] A, int K) {
        int n = A.length;
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (A[i] == K) {
                first = i;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if(A[i]==K){
                last = i;
            }
        }
        return new int[]{first,last};
    }

    public static int[] solve(int[]A,int K){
        int n = A.length;
        int start = 0,end = n-1,first = -1,last = -1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if(A[mid]==K){
                first = mid;
                end = mid - 1;
            }else if (A[mid] < K){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        start = 0;end = n-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(A[mid]==K){
                last = mid;
                start = mid+1;
            } else if (A[mid] < K) {
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return new int[]{first,last};
    }
    public static void main(String[] args) {
        int[] A = {3, 4, 13, 13, 13, 20, 40};
        int K = 13;
        System.out.println(Arrays.toString(bruteforce(A, K)));
        System.out.println(Arrays.toString(solve(A, K)));
    }
}
