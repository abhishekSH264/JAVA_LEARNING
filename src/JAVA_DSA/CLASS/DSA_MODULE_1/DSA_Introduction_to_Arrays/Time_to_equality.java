package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

import java.util.Arrays;

public class Time_to_equality {
    public static int solve(int[] A){
        int max = Integer.MIN_VALUE;
        for(int i : A){
            if(i > max) max = i;
        }
        System.out.println(max);
        int sum = 0;
        for(int i : A){
           sum+= max - i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[]A = {2, 4, 1, 3, 2};
        System.out.println(solve(A));
    }
}
