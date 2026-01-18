package CLASS.DSA_MODULE_1.DSA_Strings;

public class Longest_Palindromic_Substring {
    /*
    brute Force Steps :
        1.Generate all substrings
        2.Check if the substring is palindrome
        3.If palindrome then record the max length
     */
    public static boolean isplaindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String bruteforce(String s) {
        int n = s.length();
        int ans = Integer.MIN_VALUE;
        int start = -1;
        int end = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isplaindrome(s, i, j)) {
                    int length = j - i + 1;
                    if (length > ans) {
                        ans = length;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }

    /*
    optimized Steps:
    1.Using the expand function logic
    2.Take two-Pointers one p1 and p2
    3.We need to check the palindrome for odd length and even length
    4.for expand function while(i>=0&&j<n&&s.charAt(p1)==s.charAt(p2)) then p1-- and p2++;
     */
    public static String expand(String s, int p1, int p2, int n) {
        while (p1 >= 0 && p2 < n && s.charAt(p1) == s.charAt(p2)) {
            p1--;
            p2++;
        }
        return s.substring(p1 + 1, p2);
    }

    public static String solve(String A) {
        int n = A.length();
        String s = "";
        for (int i = 0; i < n; i++) {
            //for odd length;
            String s1 = expand(A,i,i,n);
            //for even length;
            String s2 = expand(A,i,i+1,n);
            if(s1.length() > s.length()){
                s = s1;
            }
            if(s2.length() > s.length()){
                s = s2;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(bruteforce(s));
    }
}
