package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

import java.util.HashMap;

public class Good_Pair {
    public static int bruteforce(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i] + A[j] == K) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static int better(int[] A, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            int target = K - i;
            if (map.containsKey(target)) {
                return 1;
            }
            map.put(i, 1);
        }
        return 0;
    }
    public static int solve(int[] A, int K) {
        int n = A.length;
        int start = 0, end = n - 1;
        while (start < end) {
            int sum = A[start] + A[end];
            if (sum == K) {
                return 1;
            } else if (sum < K) {
                start++;
            } else {
                end--;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int K = 7;
        System.out.println(bruteforce(A, K));
        System.out.println(better(A, K));
        System.out.println(solve(A,K));

    }
}
