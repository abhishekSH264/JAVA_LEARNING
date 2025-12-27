package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Single_element_in_a_Sorted_Array {
    //Bruteforce
    public static int brute(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return A[i];
            }
        }
        return -1;
    }

    public static int better(int[] A) {
        int n = A.length;
        int a = 0;
        for (int i = 0; i < n; i++) {
            a = a ^ A[i];
        }
        return a;
    }

    public static int safeGet(int[] A, int i) {
        int n = A.length;
        if (i >= 0 && i < n) {
            return A[i];
        }
        return Integer.MAX_VALUE;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(A[mid]!=safeGet(A,mid-1)&&A[mid]!=safeGet(A,mid+1)){
                return A[mid];
            }
            if(A[mid]==safeGet(A,mid-1)){
                mid = mid-1;
            }
            if(mid % 2==0){
                start = mid+2;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(brute(A));
        System.out.println(better(A));
        System.out.println(solve(A));
    }
}
