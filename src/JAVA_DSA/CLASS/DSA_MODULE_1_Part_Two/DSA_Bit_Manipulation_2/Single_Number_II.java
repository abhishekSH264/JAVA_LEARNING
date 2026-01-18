package CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation_2;

import java.util.HashMap;

public class Single_Number_II {
    public static int bruteforce(int[] A) {
        int n = A.length;
        int num = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            if (count == 1) {
                num = A[i];
                break;
            }
        }
        return num;
    }

    public static int good(int[] A) {
        int n = A.length;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hs.put(A[i], hs.getOrDefault(A[i], 0) + 1);
        }
        //System.out.println(hs);
        int num = -1;
        for (int i = 0; i < n; i++) {
            int ele = A[i];
            if (hs.get(ele) == 1) {
                num = ele;
                break;
            }
        }
        return num;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int a = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                int num = A[j];
                if ((num & (1 << i)) > 0){
                    count++;
                }
            }
            if(count%3!=0){
                a = a | (1 << i);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        System.out.println(bruteforce(A));
        System.out.println(good(A));
        System.out.println(solve(A));
    }
}
