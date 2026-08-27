package CLASS.DSA_MODULE_3.DSA_Maths_Combinatorics_Basics_Prime_Numbers;

import java.util.ArrayList;
import java.util.Arrays;

public class Prime_sum {
    //Bruteforce
    public static int factors(int A) {
        int count = 0;
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                if (i == A / i) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static int[] bruteforce(int A) {
        for (int i = 1; i <= A; i++) {
            int req = A - i;
            if(factors(i) == 2 && factors(req) == 2){
                return new int[]{i,req};
            }
        }
        return new int[] {};
    }
        public static void main (String[]args){
            int A = 4;
            System.out.println(Arrays.toString(bruteforce(A)));
//            System.out.println(Arrays.toString(solve(A)));
        }
    }
