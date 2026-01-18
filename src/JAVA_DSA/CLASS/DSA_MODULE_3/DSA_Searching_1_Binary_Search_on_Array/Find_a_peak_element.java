package CLASS.DSA_MODULE_3.DSA_Searching_1_Binary_Search_on_Array;

import javax.lang.model.element.AnnotationMirror;

//Consider the Example to understand the Diagram as 1,2,3,4,5,6
public class Find_a_peak_element {
    public static int bruteforce(int[] A) {
        int n = A.length;
        if (A[0] > A[1]) {
            return A[0];
        } else if (A[n - 1] > A[n - 2]) {
            return A[n - 1];
        }
        for (int i = 1; i < n - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                return A[i];
            }
        }
        return -1;
    }

    public static int safeGet(int[] A, int i) {
        int n = A.length;
        if (i >= 0 && i < n) {
            return A[i];
        }
        return Integer.MIN_VALUE;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int start = 0, end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(A[mid] >= safeGet(A,mid-1)&&A[mid] >= safeGet(A,mid+1)){
                return A[mid];
            }else if(A[mid] > safeGet(A,mid-1)&&A[mid] < safeGet(A,mid+1)){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));

    }
}
