package CLASS.DSA_MODULE_3.DSA_Lab_session_on_Prime_Numbers_Pointers_All_Quizzes;

import java.util.Arrays;

public class Three_sum {
    //Bruteforce
    public static int bruteforce(int[] A, int B) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int K = j + 1; K < n; K++) {
                    if (A[i] + A[j] + A[K] == B) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
    //Optimize
    public static int solve(int[] A, int K) {
        int n = A.length;
        Arrays.sort(A);
        for (int i = 0; i < n - 2; i++) {
            int start = i + 1;
            int end = n - 1;
            while (start < end) {
                long sum = (long)A[i] + A[start] + A[end];
                if (sum == K) {
                    return 1;
                } else if (sum < K) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {-1, 0, 1, 2, -1, -4};
        int K = 0;
        System.out.println(bruteforce(A,K));
        System.out.println(solve(A, K));
    }
}
