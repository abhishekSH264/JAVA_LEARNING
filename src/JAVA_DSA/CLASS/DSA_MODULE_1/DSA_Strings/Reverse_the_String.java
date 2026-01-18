package CLASS.DSA_MODULE_1.DSA_Strings;

public class Reverse_the_String {
    public static String reverse(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String solve(String s) {
        int n = s.length();
        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >=0; i--) {
            char ch = s.charAt(i);
            if(ch==' '){
                sb.append(reverse(str));
                sb.append(ch);
                str = "";
            }else{
                str = str+ch;
            }
        }
        sb.append(reverse(str));
        String a = sb.toString();
        return a.trim();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        String A = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv";
        System.out.println(solve(A));
    }
}
