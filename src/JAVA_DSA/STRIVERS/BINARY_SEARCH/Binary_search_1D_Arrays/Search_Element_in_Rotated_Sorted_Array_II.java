package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Search_Element_in_Rotated_Sorted_Array_II {
    //Bruteforce
    public static boolean bruteforce(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] == K) {
                return true;
            }
        }
        return false;
    }

    public static boolean solve(int[] A, int K) {
        int n = A.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == K) {
                return true;
            }
            if (A[start] == A[mid] && A[mid] == A[end]) {
                start++;
                end--;
                continue;
            }
            if (A[start] <= A[mid]) {
                if (A[start] <= K && K <= A[mid]) {
                    end = mid - 1;
                }else{
                    start = mid+1;
                }
            } else {
                if(A[mid]<=K&&K<=A[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int K = 3;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A, K));
    }

}
