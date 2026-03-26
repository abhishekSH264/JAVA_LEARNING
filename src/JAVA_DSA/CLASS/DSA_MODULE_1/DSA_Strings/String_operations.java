package CLASS.DSA_MODULE_1.DSA_Strings;

public class String_operations {
    public static String solve(String s) {
        s += s;
        int n = s.length();
        String vowels = "aeiou";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(vowels.indexOf(ch)>=0){
                    sb.append("#");
                }else{
                    sb.append(ch);
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
