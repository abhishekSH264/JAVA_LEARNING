package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

import java.util.Arrays;

public class reverse_Array {
    public static int[] reverse(int[] A){
        int n = A.length;
        int i = 0,j = n-1;
        while(i < j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;j--;
        }
        return A;
    }
    public static void main(String[] args){
        int[]A = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverse(A)));
    }
}
