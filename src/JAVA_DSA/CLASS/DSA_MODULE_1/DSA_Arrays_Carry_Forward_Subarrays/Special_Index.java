package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

import java.util.Arrays;

public class Special_Index {
    public static int bruteforce(int[] A) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int evenSum = 0;
            int oddSum = 0;

            int leftEven = 0;
            int rightEven = 0;
            int leftOdd = 0;
            int rightOdd = 0;
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    leftEven += A[j];
                } else {
                    leftOdd += A[j];
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (j % 2 == 0) {
                    rightOdd += A[j];
                } else {
                    rightEven += A[j];
                }
            }
            evenSum = leftEven + rightEven;
            oddSum = leftOdd + rightOdd;
            if (evenSum == oddSum) {
                count++;
            }
        }
        return count;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int[] evenSum = new int[n];
        int[] oddSum = new int[n];
        //preparing the Even_index_sum
        evenSum[0] = A[0];
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                evenSum[i] = evenSum[i - 1] + A[i];
            } else {
                evenSum[i] = evenSum[i - 1];
            }
        }
        System.out.println(Arrays.toString(evenSum));

        //preparing the Odd index sum
        oddSum[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                oddSum[i] = oddSum[i - 1];
            } else {
                oddSum[i] = oddSum[i - 1] + A[i];
            }
        }
        System.out.println(Arrays.toString(oddSum));
        int count = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                even = oddSum[n-1] - oddSum[i];
                odd = evenSum[n-1] - evenSum[i];
            }else{
                even = evenSum[i-1] + oddSum[n-1] - oddSum[i];
                odd = oddSum[i-1] + evenSum[n-1] - evenSum[i];
            }
            if(even==odd){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //0  1  2  3
        int[] A = {2, 1, 6, 4};
//        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
