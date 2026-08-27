package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Bit_Manipulation;

public class Strange_Equality {
    public static int solve(int A) {
        int msb = -1;

        for (int i = 31; i >= 0; i--) {
            if ((A & (1 << i)) > 0) {
                msb = i;
                break;
            }
        }
        int x = 0;
        for (int i = 0; i < msb; i++) {
            if((A & (1 << i)) == 0){
                x = x | (1 << i);
            }
        }
        int y = 1 << msb + 1;

        return x ^ y;
    }

    public static void main(String[] args) {
        int A = 5;
        System.out.println(solve(A));
    }
}
