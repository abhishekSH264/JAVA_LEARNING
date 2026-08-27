package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

import java.util.Arrays;

public class Good_Subarrays_Easy {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                int len = j - i + 1;
                if (len % 2 == 0 && sum < B || len % 2 != 0 && sum > B) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 4;
        System.out.println(solve(A, B));
    }
}

