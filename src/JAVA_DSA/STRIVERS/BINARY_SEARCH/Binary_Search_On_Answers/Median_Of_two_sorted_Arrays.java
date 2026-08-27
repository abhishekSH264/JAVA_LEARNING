package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

import java.util.Arrays;

public class Median_Of_two_sorted_Arrays {
    public static double bruteforce(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] arr = new int[n + m];

        int i = 0;
        int j = 0;
        int K = 0;
        while (i < n && j < m) {
            if (A[i] < B[j]) {
                arr[K] = A[i];
                i++;
                K++;
            } else {
                arr[K] = B[j];
                j++;
                K++;
            }
        }
        while (i < n) {
            arr[K] = A[i];
            i++;
            K++;
        }
        while (j < m) {
            arr[K] = B[j];
            j++;
            K++;
        }
        System.out.println(Arrays.toString(arr));
        int L = arr.length;
        if (L % 2 == 0) {
            return (arr[L / 2] + arr[L / 2 - 1]) / 2.0;
        } else {
            return (double) A[L / 2];
        }
    }

    public static int solve(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;

        if (n > m) return solve(B, A);

        int totalLen = n + m;
        int totalLeft = (totalLen + 1) / 2;

        int start = 0, end = n;
        while (start <= end) {
            int cutA = start + (end - start) / 2;
            int cutB = totalLeft - cutA;

            int l1 = cutA - 1;
            int l2 = cutB - 1;
            int r1 = cutA;
            int r2 = cutB;

            int left1 = Integer.MIN_VALUE;
            int left2 = Integer.MIN_VALUE;
            int right1 = Integer.MAX_VALUE;
            int right2 = Integer.MAX_VALUE;

            if (l1 >= 0) left1 = A[l1];
            if (l2 >= 0) left2 = B[l2];
            if (r1 < n) right1 = A[r1];
            if (r2 < m) right2 = B[r2];

            if (left1 < right2 && left2 < right1) {
                if (totalLen % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2;
                } else {
                    return Math.max(left1, left2);
                }

            } else if (left1 > right2) {
                end = cutA - 1;
            }else{
                start = cutA + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 6};
        int[] B = {1, 3, 5};
        System.out.println(bruteforce(A, B));
        System.out.println(solve(A,B));
    }
}
