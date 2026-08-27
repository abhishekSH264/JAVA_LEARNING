package CLASS.DSA_MODULE_2.DSA_Searching_2_Binary_Search_on_Answer;

import java.util.Arrays;

public class ADD_OR_NOT {
    public static int[] bruteforce(int[] A, int K) {
        Arrays.sort(A);
        int n = A.length;
        int maxFreq = 0;
        int element = A[0];
        for (int i = 0; i < n; i++) {
            int target = A[i];
            int operation = K;
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                int diff = target - A[j];
                if (diff <= operation) {
                    count++;
                    operation -= diff;
                }
            }
            if (count > maxFreq) {
                maxFreq = count;
                element = target;
            }
        }
        return new int[]{maxFreq, element};
    }

    public static int[] solve(int[] A, int K) {
        Arrays.sort(A);
        int n = A.length;
        // Creating the prefix sum for Computing the sum in O(1) time
        long[] prefix = new long[n];
        prefix[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }

        int maxFreq = 1;
        int element = A[0];

        for (int i = 0; i < n; i++) {
            int start = 0, end = i;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                long sum;
                if (mid > 0) {
                    sum = prefix[i] - prefix[mid - 1];
                } else {
                    sum = prefix[i];
                }
                int length = (i - mid) + 1;
                long cost = (long) A[i] * length;
                if (cost - sum <= K) {
                    if (length > maxFreq) {
                        maxFreq = length;
                        element = A[i];
                    }
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return new int[]{maxFreq, element};
    }

    public static int[] solve2(int[] A, int K) {
        Arrays.sort(A);
        int n = A.length;
        int maxfeq = 1;
        int element = A[0];
        long sum = 0;
        int l = 0;
        for (int r = 0; r < n; r++) {
            int target = A[r];
            sum += A[r];

            while ((long) target * (r - l + 1) - sum > K){
                sum-=A[l];
                l++;
            }
            int length = r - l + 1;
            if(length > maxfeq){
                maxfeq = length;
                element = target;
            }
        }
        return new int[] {maxfeq,element};
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 2, 1};
        //sorted = 1  1  2  2  3
        int B = 3;
        System.out.println(Arrays.toString(bruteforce(A, B)));
        System.out.println(Arrays.toString(solve(A, B)));
        System.out.println(Arrays.toString(solve2(A, B)));
    }
}
