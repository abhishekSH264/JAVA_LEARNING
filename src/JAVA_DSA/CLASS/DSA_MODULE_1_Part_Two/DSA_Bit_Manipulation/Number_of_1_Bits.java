package CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation;

public class Number_of_1_Bits {
    public static int solve(int A) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            if ((A & (1 << i)) > 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkBit(int A, int i) {
        int val = A & (1 << i);
        if (val == 0) {
            return false;
        }
        return true;
    }

    public static int solve1(int A) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            if(checkBit(A,i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int n = 11;
        System.out.println(solve(n));
        System.out.println(solve1(n));
    }
}
