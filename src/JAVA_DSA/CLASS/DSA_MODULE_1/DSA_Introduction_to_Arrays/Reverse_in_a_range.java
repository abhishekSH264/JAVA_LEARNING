package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

public class Reverse_in_a_range {
    public static void reverse(int[]A,int B,int C){
        while(B < C){
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;C--;
        }
    }
    public static int[] solve(int[]A,int B,int C){
        reverse(A,B,C);
        return A;
    }
}
