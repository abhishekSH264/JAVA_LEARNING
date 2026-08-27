package CLASS.DSA_MODULE_1.DSA_Strings;

import java.io.StringBufferInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse_the_String {
    public static String BruteForce(String s) {
        String[] A = s.split(" ");
        int n = A.length;
        int i = 0, j = n - 1;
        while (i < j) {
            String temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", A).trim();
    }

    public static String solve(String s) {
        Scanner sc = new Scanner(s);
        Stack<String> st = new Stack<>();
        while (sc.hasNext()){
            st.push(sc.next());
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
            if(!st.isEmpty()){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String A = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv";
        System.out.println(BruteForce(s));
        System.out.println(solve(s));
    }
}
