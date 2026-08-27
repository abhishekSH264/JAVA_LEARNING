package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Bit_Manipulation;

public class Number_of_1_Bits {
    public static int solve(int A) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            if((A & (1 << i)) > 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(solve(n));
    }
}
