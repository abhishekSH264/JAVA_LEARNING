package CLASS.DSA_MODULE_1.DSA_Strings;

public class Simple_Reverse {
    public static String reverse(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return s;
    }

    public static String solve(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "scaler";
        System.out.println(reverse(s));
        System.out.println(solve(s));
    }
}
