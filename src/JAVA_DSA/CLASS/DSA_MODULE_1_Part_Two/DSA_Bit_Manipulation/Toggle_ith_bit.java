package CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation;

public class Toggle_ith_bit {
    public static int solve(int A,int B){
        if((A & (1 <<  B)) > 0){
            A = A ^ (1 << B);
        }else{
            A = A | (1 << B);
        }
        return A;
    }
    public static void main(String[] args){
        int A = 4;
        int B = 1;
        System.out.println(solve(A,B));
    }
}
