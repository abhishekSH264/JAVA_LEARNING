package CLASS.DSA_MODULE_1.DSA_Sorting_Basics;

import java.util.Arrays;

public class Arithmetic_Progression {
    public static int solve(int[]A){
        int n = A.length;
        Arrays.sort(A);
        int diff = A[1] - A[0];
        for(int i = 2;i <n; i++){
            if(A[i] - A[i-1]!=diff){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] A = {3, 5, 1};
        System.out.println(solve(A));
    }
}
