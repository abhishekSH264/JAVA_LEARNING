package CLASS.DSA_MODULE_3.DSA_Lab_session_on_Prime_Numbers_Pointers_All_Quizzes;

import java.util.Arrays;

public class Three_sum_closest_sum {
    public static int solve(int[] A, int K) {
        int n = A.length;
        Arrays.sort(A);
        int closestSum = A[0] + A[1] + A[2];

        for (int i = 0; i < n - 2; i++) {
            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                int sum = A[i] + A[start] + A[end];
                if(Math.abs(sum - K) <Math.abs(closestSum - K)) closestSum = sum;

                else if (sum < K){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] A = {-1, 2, 1, -4};
        int K = 1;
        System.out.println(solve(A,K));
    }
}
