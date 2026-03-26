package CLASS.DSA_MODULE_1.DSA_Bit_Manupulations;

public class Convert_binary_string_to_number {
    public static int decimalToBinary(int n){
        if(n ==0){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.append(n % 2);
            n/=2;
        }
        sb.reverse();
        return convert_binary_string_to_number(sb.toString());
    }
    public static int convert_binary_string_to_number(String s){
        int n = s.length();
        int num = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            num = num * 10 + (ch - '0');
        }
        return num;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(decimalToBinary(n));
    }
}
