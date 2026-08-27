package CLASS.DSA_MODULE_1.DSA_Bit_Manupulations;

public class Binary_Palindrome_via_String {
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

    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n%2);
            n/=2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(isPalindrome(decimalToBinary(n)));
    }
}
