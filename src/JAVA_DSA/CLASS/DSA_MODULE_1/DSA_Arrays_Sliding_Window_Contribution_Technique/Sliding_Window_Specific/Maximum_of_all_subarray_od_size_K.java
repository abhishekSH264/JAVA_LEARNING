package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique.Sliding_Window_Specific;

import java.util.ArrayList;

public class Maximum_of_all_subarray_od_size_K {
    public static ArrayList<Integer> bruteForce(int[] A, int K) {
        int n = A.length;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i <= n - K; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + K; j++) {
                max = Math.max(max,A[j]);
            }
            al.add(max);
        }
        return al;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, -1, -3, 5, 3, 6, 7};
        int K = 3;
        System.out.println(bruteForce(A,K));
    }
}
