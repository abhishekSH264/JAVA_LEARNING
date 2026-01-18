package CLASS.DSA_MODULE_1.DSA_Strings;

public class String_operations {
    public static String solve(String s) {
        s = s + s;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiou";
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                if(vowels.indexOf(s.charAt(i))>=0){
                    sb.append("#");
                }else{
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "aeiOUz";
        System.out.println(solve(s));
    }
}
