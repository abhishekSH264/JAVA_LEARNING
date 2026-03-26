package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Count_Occurrences_in_Sorted_Array {
    public static int brute(int[] A, int K) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == K) {
                count++;
            }
        }
        return count;
    }

    public static int solve(int[] A, int K) {
        int n = A.length;
        int start = 0, end = n - 1, first = -1, last = -1;

        //finding the first Occurrence
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == K) {
                first = mid;
                end = mid - 1;
            } else if (A[mid] < K) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //Last Occurrence
        start = 0;
        end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == K) {
                last = mid;
                start = mid + 1;
            } else if (A[mid] < K) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last - first + 1;
    }
    public static void main(String[] args) {
        int[] A = {2, 2, 3, 3, 3, 3, 4};
        int K = 3;
        System.out.println(brute(A, K));
        System.out.println(solve(A,K));
    }
}
