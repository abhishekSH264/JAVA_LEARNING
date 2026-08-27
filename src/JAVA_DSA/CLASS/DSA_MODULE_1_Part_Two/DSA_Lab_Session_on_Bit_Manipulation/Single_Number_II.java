package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Bit_Manipulation;

import java.util.HashMap;

public class Single_Number_II {
    public static int bruteForce(int[] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return A[i];
            }
        }
        return -1;
    }

    public static int better(int[] A) {
        int n = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(A[i]) == 1) {
                return A[i];
            }
        }
        return -1;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((A[j] & (1 << i)) > 0) {
                    count++;
                }
            }
            if (count % 3 != 0){
                ans = ans | (1 << i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        System.out.println(bruteForce(A));
        System.out.println(better(A));
        System.out.println(solve(A));
    }

}
