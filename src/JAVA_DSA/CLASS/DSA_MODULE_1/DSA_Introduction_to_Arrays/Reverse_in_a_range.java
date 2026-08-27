package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

public class Reverse_in_a_range {
    public static int[] solve(int[] A,int B,int C){
        while (B < C){
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;C--;
        }
        return A;
    }
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4};
        int B = 2;
        int C = 3;
    }
}
