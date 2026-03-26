package CLASS.DSA_MODULE_1.DSA_Bit_Manupulations;
import java.util.*;
import java.lang.*;
public class Decimal_to_Binary {
    public static String decimalToBinary(int num) {
        if(num==0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            sb.append(num%2);
            num/=2;
        }
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(decimalToBinary(n));

    }
}
