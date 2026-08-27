package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import javax.swing.*;
import java.util.Arrays;

public class Prefix_Sum {
    public static int[] solve(int[]A){
        int n = A.length;
        int[] prefix = new int[n];
        prefix[0] = A[0];
        for(int i = 1; i < n; i ++){
            prefix[i] = prefix[i-1] +A[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        int[]A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solve(A)));
    }
}
