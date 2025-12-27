package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Binary_search {

    //BruteForce
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
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == K) {
                return mid;
            } else if (A[mid] < K) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {3, 6, 9, 12, 14, 19, 20, 23, 25, 27};
        int B = 3;
        System.out.println(bruteforce(A, B));
        System.out.println(solve(A, B));
    }
}
