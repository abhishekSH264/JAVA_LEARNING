package STRIVERS.Basic_Maths;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Print_all_Divisors_of_a_given_Number {

    public static ArrayList<Integer> solve(int n){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i * i <= n; i++){
            if(n % i ==0){
                al.add(i);
                if(i!=n/i){
                    al.add(n/i);
                }
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int n = 100;
        System.out.println(solve(n));
    }
}
