package CLASS.DSA_MODULE_1.DSA_Strings;

public class check_plaindrome {
    public static boolean isPalindrome(String s){
        int n = s.length();
        int i =0, j = n-1;
        while (i < j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));
    }
}
