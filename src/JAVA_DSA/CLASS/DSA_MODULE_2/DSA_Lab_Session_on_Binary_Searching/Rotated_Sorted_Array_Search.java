package CLASS.DSA_MODULE_2.DSA_Lab_Session_on_Binary_Searching;

public class Rotated_Sorted_Array_Search {
    public static int bruteforce(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] == K) {
                return i;
            }
        }
        return -1;
    }

    public static int solve(int[] A, int K) {
        int n = A.length;
        int start = 0, end = n - 1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == K) {
                return mid;
            }
            if (A[start] <= A[mid]) {
                if (A[start] <= K && K <= A[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(A[mid] <= K && K <= A[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {4, 5, 6, 7, 0, 1, 2, 3};
        int K = 3;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A, K));
    }
}
