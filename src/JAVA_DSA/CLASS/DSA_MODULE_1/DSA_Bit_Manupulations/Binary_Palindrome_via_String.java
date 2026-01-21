package CLASS.DSA_MODULE_1.DSA_Bit_Manupulations;

public class Binary_Palindrome_via_String {
    public static String toBinary(int n) {
        int x = n;
        StringBuilder binary = new StringBuilder();
        while (x != 0) {
            binary.append(x % 2);
            x /= 2;
        }
        binary.reverse();
        return binary.toString();
    }
    public static boolean isPalindrome(String s){
        int n = s.length();
        int i = 0, j = n-1;
        while (i < j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public static boolean solve(int n){
        String binary = toBinary(n);
        return isPalindrome(binary);
    }
    public static void main(String[] args){
        int n = 15;
        System.out.println(solve(n));
    }
}
