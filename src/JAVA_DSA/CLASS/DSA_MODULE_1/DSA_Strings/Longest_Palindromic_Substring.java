package CLASS.DSA_MODULE_1.DSA_Strings;

public class Longest_Palindromic_Substring {
    /*
    brute Force Steps :
        1.Generate all substrings
        2.Check if the substring is palindrome
        3.If palindrome then record the max length
     */
    public static boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n - 1;
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
        int count = 0;
        String sub = "";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String A = s.substring(i, j + 1);
                if (isPalindrome(A)) {
                    if (A.length() > sub.length()) {
                        sub = A;
                    }
                }
            }
        }
        return sub;
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
        int left = p1;
        int right = p2;
        while ((left >= 0 && right < n) && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static String solve(String s) {
        int n = s.length();
        String A = "";
        for (int i = 0; i < n; i++) {
            String s1 = expand(s,i,i);
            if(s1.length() > A.length()){
                A = s1;
            }
            String s2 = expand(s,i,i+1);
            if(s2.length() > A.length()){
                A = s2;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        String s1 = "aaaabaaa";
        System.out.println(bruteforce(s));
        System.out.println(bruteforce(s1));
        System.out.println(solve(s));
    }
}
