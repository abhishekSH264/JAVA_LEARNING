package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Leaders_in_an_array {
    public static int[] bruteforce(int[] A) {
        int n = A.length;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean isGreater = true;
            for (int j = i + 1; j < n; j++) {
                if (A[j] > A[i]) {
                    isGreater = false;
                }
            }
            if (isGreater) {
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
        int max = -1;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (A[i] > max) {
                max = A[i];
                al.add(max);
            }
        }
        int[] arr = new int[al.size()];
        int j = 0;
        for (int i = al.size()-1; i >=0; i--) {
            arr[j] = al.get(i);
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(bruteforce(A)));
        System.out.println(Arrays.toString(solve(A)));
    }
}
