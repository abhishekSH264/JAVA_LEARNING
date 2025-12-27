package STRIVERS.PATTERNS;

public class Longest_Common_Prefix {
    public static String common(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            } else {
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String LongestCommonPrefix(String[] A) {
        String result = A[0];
        int n = A.length;
        for (int i = 1; i < n; i++) {
            result = common(result,A[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] s = {"abcdefgh", "aefghijk", "abcefgh"};
    }
}
