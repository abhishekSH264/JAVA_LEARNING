package CLASS.DSA_MODULE_1.DSA_Bit_Manupulations;
import java.util.*;
import java.lang.*;
public class Decimal_to_Binary {
    public static String toBinary(int n){
        int x = n;
        StringBuilder binary = new StringBuilder();
        while(x!=0){
            binary.append(x%2);
            x /= 2;
        }
        binary.reverse();
        return binary.toString();
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(toBinary(n));

    }
}
