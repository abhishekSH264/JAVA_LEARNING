package CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation;


public class Single_Number {
    public static int solve(int[]A){
        int n = A.length;
        int a = 0;
        for(int i=0;i<n;i++){
            a = a ^ A[i];
        }
        return a;
    }
    public static void main(String[] args){
        int[] A = {1, 2, 2, 3, 1};
        System.out.println(solve(A));
    }
}
