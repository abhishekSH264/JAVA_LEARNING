package CLASS.DSA_MODULE_1.DSA_Bit_Manupulations;

public class Binary_Palindrome_Via_Number {

    public static int convert(String s) {
        int n = s.length();
        int num = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            num = num * 10 + (ch - '0');
        }
        return num;
    }

    public static int binaryToDecimal(int n) {
        if (n == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        sb.reverse();
        return convert(sb.toString());
    }

    public static boolean isPalindrome(int n) {
        int x = n;
        int rev = 0;
        while (x > 0) {
            int digit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && digit > 7) {
                return false;
            }
            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev==n;
    }
    public static void main(String[] args){
        int n = 15;
        System.out.println(isPalindrome(binaryToDecimal(n)));
    }
}
