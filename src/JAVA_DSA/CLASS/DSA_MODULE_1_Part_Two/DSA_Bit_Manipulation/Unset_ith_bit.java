package CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation;

public class Unset_ith_bit {
    public static long solve(long A, int B) {
        for (int i = 0; i < B; i++) {
            if ((A & (1 << i)) > 0) {
                A = A ^ (1 << i);
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int A = 4;
        int B = 1;
        System.out.println(solve(A, B));
    }
}
