package STRIVERS.Basic_Maths;

import java.util.ArrayList;

public class Print_all_Divisors_of_a_given_Number {
    public static ArrayList<Integer> divisors(int A) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                al.add(i);
                if (i != A / i) {
                    al.add(A/i);
                }
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int n = 36;
        System.out.println(divisors(n));
    }
}
