package CLASS.DSA_MODULE_1.DSA_Strings;

public class Simple_Reverse {
    public static String solve(String A){
        int n = A.length();
        StringBuilder sb = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(A.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "scaler";
        System.out.println(solve(s));
    }
}
