package CLASS.DSA_MODULE_1.DSA_Bit_Manupulations;

import java.util.*;
import java.lang.*;

public class Decimal_to_Binary {
    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 2);
            n/=2;
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(decimalToBinary(n));

    }
}
