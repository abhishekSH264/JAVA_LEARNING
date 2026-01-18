package CLASS.DSA_MODULE_1.DSA_Bit_Manupulations;

public class Decimal_to_Binary {
    public static int toBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int rem = n % 2;
            sb.append(rem);
            n /= 2;
        }
        sb.reverse();
        return toNumber(sb.toString());

    }
    public static int toNumber(String s){
        int num = 0;
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            num = num * 10 + (ch-'0');
        }
        return num;
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(toBinary(n));
    }
}
