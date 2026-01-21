package CLASS.DSA_MODULE_3.DSA_Searching_1_Binary_Search_on_Array;

import java.util.Arrays;

public class Search_for_a_Range {
    public static int[] bruteforce(int[] A, int K) {
        int n = A.length;
        int first = -1, last = -1;

        for (int i = 0; i < n; i++) {
            if (A[i] == K) {
                first = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if(A[i]==K){
                last = i;
                break;
            }
        }
        return new int[]{first,last};
    }
    public static int[] solve(int[]A,int K){
        int n = A.length;
        int start = 0,end = n-1,first = -1,last = -1;

        //first Occurrence
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(A[mid]==K){
                first = mid;
                end = mid-1;
            }else if(A[mid] < K){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        //last Occurrence
        start = 0;end = n-1;
        while (start <= end){
            int mid = start + (end - start) /2;
            if(A[mid]==K){
                last = mid;
                start = mid+1;
            }else if(A[mid] < K){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return new int[] {first,last};
    }
    public static void main(String[] args) {
        int[]A = {5, 7, 7, 8, 8, 10};
        int K = 8;
        System.out.println(Arrays.toString(bruteforce(A, K)));
        System.out.println(Arrays.toString(solve(A,K)));

    }

}
