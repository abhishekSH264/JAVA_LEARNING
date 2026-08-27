package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

import java.util.function.DoubleUnaryOperator;

public class Subarray_with_least_average {
    public static int bruteforce(int[] A, int B) {
        int n = A.length;
        int ans = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i <= n - B; i++) {
            int sum = 0;
            for (int j = i; j < i + B; j++) {
                sum += A[j];
            }
            if (sum < ans) {
                ans = sum;
                idx = i;
            }
        }
        return idx;
    }

    public static int brute1(int[] A, int B) {
        int n = A.length;
        double ans = Double.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i <= n - B; i++) {
            int sum = 0;
            for (int j = i; j < i + B; j++) {
                sum += A[j];
            }
            double avg = (double) sum / B;
            if (avg < ans) {
                ans = avg;
                idx = i;
            }
        }
        return idx;
    }

    //Using the Sliding window two pointers approach
    public static int solve(int[] A, int B) {
        int n = A.length;
        int ans = Integer.MAX_VALUE;
        int idx = -1;
        int i = 0, j = 0;
        int sum = 0;
        while (j < n) {
            sum += A[j];
            int len = j - i + 1;
            if (len < B) {
                j++;
            } else if (len == B) {
                if (sum < ans) {
                    ans = sum;
                    idx = i;
                }
                sum -= A[i];
                i++;
                j++;
            }
        }
        return idx;
    }

    public static int solve1(int[] A, int B) {
        int n = A.length;
        double ans = Double.MAX_VALUE;
        int idx = -1;
        int sum = 0;
        int i = 0, j = 0;
        while (j < n) {
            sum += A[j];
            int len = j - i + 1;
            if (len < B) {
                j++;
            } else if (len == B) {
                double avg = (double) sum / B;
                if (avg < ans) {
                    ans = avg;
                    idx = i;
                }
                sum -= A[i];
                i++;
                j++;
            }
        }
        return idx;
    }

    //Using the Sliding window Fixed Size Approach
    public static int solve2(int[] A, int B) {
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        int ans = sum;
        int idx = 0;
        int start = 1, end = B;
        while (end < n) {
            sum = sum - A[start - 1] + A[end];
            if (sum < ans) {
                ans = sum;
                idx = start;
            }
            start++;
            end++;
        }
        return idx;
    }

    public static int solve3(int[] A, int B) {
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        double ans = (double) sum / B;
        int idx = -1;
        int start = 1, end = B;
        while (end < n){
            sum = sum - A[start - 1] + A[end];
            double avg = (double) sum / B;
            if(avg < ans){
                ans = avg;
                idx = start;
            }
            start++;end++;
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;
        System.out.println(bruteforce(A, B));
        System.out.println(brute1(A, B));
        System.out.println(solve(A, B));
        System.out.println(solve1(A, B));
        System.out.println(solve2(A, B));
        System.out.println(solve3(A,B));
    }
}
