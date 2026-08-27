package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

import java.util.HashMap;

public class Majority_Element_n_2 {
    public static int bruteforce(int[] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
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
            if (map.get(A[i]) > n / 2) {
                return A[i];
            }
        }
        return -1;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int candidate = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(count == 0){
                candidate = A[i];
                count = 1;
            }else if(A[i] == candidate){
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for(int i : A){
            if(i == candidate){
                count++;
            }
        }
        if(count > n/2){
            return candidate;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {2, 2, 3, 3, 1, 2, 2};
        int[] B = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(bruteforce(B));
        System.out.println(better(B));
        System.out.println(solve(B));

    }
}
