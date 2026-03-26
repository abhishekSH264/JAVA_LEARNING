package CLASS.DSA_MODULE_1.DSA_Strings;

import java.util.Arrays;

public class Longest_Common_prefix {
    public static String common(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }

    public static String bruteforce(String[] A) {
        int n = A.length;
        String result = A[0];
        for (int i = 1; i < n; i++) {
            result = common(result, A[i]);
        }
        return result;
    }

    public static String solve(String[] A) {
        Arrays.sort(A);
        StringBuilder sb = new StringBuilder();
        int n = A.length;
        String s1 = A[0];
        String s2 = A[n - 1];
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] A = {"abcdefgh", "aefghijk", "abcefgh"};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
