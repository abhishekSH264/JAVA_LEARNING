package CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation;


import java.util.HashMap;

public class Single_Number {
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
        int a = 0;
        for(int i : A){
            a = a ^ i;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 1};
        System.out.println(bruteForce(A));
        System.out.println(better(A));
        System.out.println(solve(A));
    }
}
