package CLASS.DSA_MODULE_1.DSA_Strings;

public class SwitchCase {
    public static String solve(String s) {
        int n = s.length();
        String A = "";
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch>='A'&&ch<='Z'){
                A+=(char)(ch+32);
            } else if (ch>='a'&&ch<='z') {
                A+=(char)(ch-32);
            }
        }
        return A;
    }

    public static void main(String[] args) {
        String s = "HeLlo";
        System.out.println(solve(s));
    }
}
