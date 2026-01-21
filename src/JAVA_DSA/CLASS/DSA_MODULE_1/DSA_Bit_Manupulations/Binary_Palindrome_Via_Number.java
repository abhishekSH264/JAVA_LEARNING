package CLASS.DSA_MODULE_1.DSA_Bit_Manupulations;

public class Binary_Palindrome_Via_Number {
    public static int toBinary(int n){
        int x = n;
        StringBuilder binary = new StringBuilder();
        if(x==0){
            return 0;
        }
        while(x!=0){
            binary.append(x%2);
            x/=2;
        }
        binary.reverse();
        return toNumber(binary.toString());
    }
    public static int toNumber(String s){
        int n = s.length();
        int number = 0;
        for(int i = 0 ; i < n; i++){
            number = number * 10 + (s.charAt(i) - '0');
        }
        return number;
    }
    public static boolean isPalindrome(int n){
        int x = n;
        int palindrome = 0;
        while (x!=0){
            int digit = x % 10;
            if(palindrome > Integer.MAX_VALUE/ 10 || palindrome == Integer.MAX_VALUE /10 && digit > 7){
                return false;
            }
            palindrome = palindrome * 10 + digit;
            x /= 10;
        }
        return palindrome==n;
    }
    public static boolean solve(int n){
        return isPalindrome(toBinary(n));
    }
    public static void main(String[] args){
        int n = 15;
        System.out.println(solve(n));
    }
}
