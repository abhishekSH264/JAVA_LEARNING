package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Leaders_in_an_array {
    public static int[] bruteforce(int[] A) {
        int n = A.length;
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int max = A[i];
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, A[j]);
            }
            if (max == A[i]) {
                al.add(A[i]);
            }
        }
        int[] arr = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }
    public static int[] solve(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (A[i] > max) {
                al.add(A[i]);
                max = A[i];
            }
        }
        int[] arr = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(bruteforce(A)));
        System.out.println(Arrays.toString(solve(A)));
    }
}
