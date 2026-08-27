package CLASS.DSA_MODULE_1.DSA_Strings;

public class Simple_Reverse {
    public static String BruteForce(String s) {
        char[] A = s.toCharArray();
        int n = A.length;
        int i = 0, j = n-1;
        while (i < j){
            char temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;j--;
        }
        String str = new String(A);
        return str;
    }
    public static String solve(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = n-1; i >= 0; i--){
            char ch = s.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "scaler";
        System.out.println(BruteForce(s));
        System.out.println(solve(s));
    }
}
