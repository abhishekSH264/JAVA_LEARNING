package CLASS.DSA_MODULE_1.DSA_Strings;

public class Toggle_Case {
    public static String solve(String A) {
        int n = A.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if(ch >='A'&&ch<='Z'){
                sb.append((char)(ch+32));
            }else if(ch>='a'&&ch<='z'){
                sb.append((char)(ch-32));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(solve(s));
    }
}
