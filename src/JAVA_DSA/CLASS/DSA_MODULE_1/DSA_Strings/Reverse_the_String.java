package CLASS.DSA_MODULE_1.DSA_Strings;

import java.util.Arrays;

public class Reverse_the_String {
    public static String solve(String A) {
        String[] s = A.split(" ");
//        System.out.println(Arrays.toString(s));
        int n = s.length;
        int i = 0, j = n - 1;
        while(i < j){
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;j--;
        }
//        System.out.println(Arrays.toString(s));

        return String.join(" ",s);
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        String A = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv";
        System.out.println(solve(s));
    }
}
