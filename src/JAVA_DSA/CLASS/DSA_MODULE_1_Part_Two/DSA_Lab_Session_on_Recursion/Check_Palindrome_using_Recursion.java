package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Recursion;

public class Check_Palindrome_using_Recursion {
    //iterative
    public static boolean iterative(String s) {
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

    public static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindrome(s, start + 1, end - 1);
    }

    public static boolean solve(String s) {
        int n = s.length();
        int start = 0, end = n - 1;
        return isPalindrome(s,start,end);
    }

    static void main() {
        String s = "madam";
        System.out.println(iterative(s));
        System.out.println(solve(s));
    }
}
