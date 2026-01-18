package STRIVERS.Basic_Maths;

public class Check_Palindrome {
    public static boolean solve(int n){
        int x = n;
        if(x  <  0){
            return false;
        }
        int rev = 0;
        while(x != 0){
            int digit = x % 10;
            if(rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE /10 && digit > 7){
                return false;
            }
            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev==n;
    }
    public static void main(String[] args) {
        int n = 121;
        int x = -121;
        System.out.println(solve(n));
        System.out.println(solve(x));
    }
}
