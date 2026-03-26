package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_2_Two_Dimensional;

import java.util.Arrays;

public class First_Missing_integer {
    public static int bruteforce(int[]A){
        int n = A.length;
        for(int i = 1; i <= n; i++){
            boolean isPresent = false;
            for(int j = 0; j < n; j++){
                if(A[j]==i){
                    isPresent = true;
                }
            }
            if(!isPresent){
                return i;
            }
        }
        return n+1;
    }
    public static int solve(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] <= 0) {
                A[i] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < n; i++) {
            int val = Math.abs(A[i]);
            System.out.println(val);
            if (val <= n) {
                int index = val - 1;
                System.out.println(index);
                A[index] = (Math.abs(A[index])) * -1;
                System.out.println(A[index]);
            }
        }
        System.out.println(Arrays.toString(A));
        for (int i = 0; i < n; i++) {
            if(A[i] > 0){
                return i+1;
            }
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2};
        int[] B = {3, 4, -1, 1};
        int[] C = {1};
        System.out.println(solve(C));
//        System.out.println(solve(B));
//        System.out.println(bruteforce(A));
    }
}
