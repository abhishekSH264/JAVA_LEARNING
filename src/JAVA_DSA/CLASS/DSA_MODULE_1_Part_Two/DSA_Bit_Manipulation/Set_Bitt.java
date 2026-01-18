package CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation;

public class Set_Bitt {
    public static int solve(int A,int B){
        int n = 0;
        n = n | (1 << A);
        n = n | (1 << B);
        return n;
    }
    public static void main(String[] args){
        int A = 3;
        int B = 5;
    }
}
