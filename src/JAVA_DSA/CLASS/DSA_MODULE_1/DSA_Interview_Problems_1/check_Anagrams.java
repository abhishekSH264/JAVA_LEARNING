package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

import java.util.Arrays;

public class check_Anagrams {
    public static int bruteForce(String A, String B) {
        if (A.length() != B.length()) {
            return 0;
        }
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static int solve(String A, String B) {
        if (A.length() != B.length()) {
            return 0;
        }
        int[] freq = new int[26];
        for (int i = 0; i < A.length(); i++) {
            freq[A.charAt(i) - 'a']++;
            freq[B.charAt(i) - 'a']--;
        }
        for (int i : freq) {
            if(i!=0){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        String A = "secure";
        String B = "rescue";
        System.out.println(bruteForce(A, B));
        System.out.println(solve(A,B));
    }
}
