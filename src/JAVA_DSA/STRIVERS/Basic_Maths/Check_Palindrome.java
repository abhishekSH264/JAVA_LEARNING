package STRIVERS.Basic_Maths;

public class Check_Palindrome {
    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int x = n;
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            if(rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && digit > 7){
                return false;
            }
            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        int n = 121;
        int x = -121;
        System.out.println(isPalindrome(n));
        System.out.println(isPalindrome(x));
    }
}
