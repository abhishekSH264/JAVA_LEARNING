package CLASS.DSA_MODULE_1.DSA_Strings;

public class Amazing_Subarrays {
    public static int solve(String s) {
        int n = s.length();
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String A = s.substring(i, j + 1);
                if (vowels.indexOf(A.charAt(0)) >= 0) {
                    count++;
                    count %= 10003;
                }
            }
        }
        return count;
    }
    public static int solve1(String s){
        int n = s.length();
        long count = 0;
        String vowels = "aeiouAEIOU";
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(vowels.indexOf(ch)>=0){
                count+=(n-i);
                count%=10003;
            }
        }
        return (int) count;
    }
    public static void main(String[] args) {
        String s = "ABEC";
        System.out.println(solve1(s));
        System.out.println(solve(s));
    }
}
