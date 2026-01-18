package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Hashing;

import java.util.HashSet;

public class Sub_array_with_0_sum {
    public static int solve(int[] A) {
        int n = A.length;
        int[] prefix = new int[n];
        prefix[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int val = prefix[i];
            if (val == 0 || set.contains(val)) {
                return 1;
            }
            set.add(val);
        }
        return 0;
    }

    public static int solve1(int[] A) {
        int n = A.length;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            sum+=A[i];
            if(sum==0||set.contains(sum)) return 1;
            set.add(sum);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {4, -1, 1};
        System.out.println(solve(A));
    }
}
