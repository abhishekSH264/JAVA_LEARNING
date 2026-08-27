package CLASS.DSA_MODULE_1.DSA_Strings;

public class Longest_Palindromic_Substring {
    /*
    brute Force Steps :
        1.Generate all substrings
        2.Check if the substring is palindrome
        3.If palindrome then record the max length
     */
    public static boolean isPalindrome(String s, int si, int en) {
        int i = si;
        int j = en;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int bruteforce(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int len = j - i + 1;
                if (isPalindrome(s, i, j)) {
                    ans = Math.max(ans, len);
                }
            }
        }
        return ans;
    }

    /*
    optimized Steps:
    1.Using the expand function logic
    2.Take two-Pointers one p1 and p2
    3.We need to check the palindrome for odd length and even length
    4.for expand function while(i>=0&&j<n&&s.charAt(p1)==s.charAt(p2)) then p1-- and p2++;
     */
    public static String expand(String s, int p1, int p2) {
        int n = s.length();
        int l = p1;
        int r = p2;
        while ((l >= 0 && r < n) && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

    public static String solve(String s) {
        int n = s.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            String s1 = expand(s, i, i);
            if (s1.length() > ans.length()) {
                ans = s1;
            }
            String s2 = expand(s, i, i + 1);
            if (s2.length() > ans.length()){
                ans = s2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        String s1 = "aaaabaaa";
        System.out.println(bruteforce(s));
//        System.out.println(bruteforce(s1));
        System.out.println(solve(s));
    }
}
