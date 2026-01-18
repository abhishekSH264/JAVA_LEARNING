package CLASS.DSA_MODULE_3.DSA_Searching_1_Binary_Search_on_Array;

public class Matrix_Search {
    //Brute Force TC - O(n) Sc - O(1);
    public static int bruteForce(int[][] A, int K) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int m = A[i].length;
            for (int j = 0; j < m; j++) {
                if (A[i][j] == K) {
                    return 1;
                }
            }
        }
        return 0;
    }

    //Better 1
    public static int stairCase(int[][] A, int K) {
        int n = A.length;
        int m = A[0].length;
        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            int ele = A[i][j];
            if (ele == K) {
                return 1;
            } else if (ele < K) {
                i++;
            } else {
                j--;
            }
        }
        return 0;
    }

    public static boolean binarySearch(int[] A, int K) {
        int n = A.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == K) {
                return true;
            } else if (A[mid] < K) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static int usingBinarySearch(int[][] A, int K) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int m = A[i].length;
            if(K>=A[i][0] && K<=A[i][m-1]){
                if(binarySearch(A[i],K)){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[][] A = {{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        int K = 3;
        System.out.println(bruteForce(A, K));
        System.out.println(stairCase(A, K));
        System.out.println(usingBinarySearch(A,K));

    }
}
