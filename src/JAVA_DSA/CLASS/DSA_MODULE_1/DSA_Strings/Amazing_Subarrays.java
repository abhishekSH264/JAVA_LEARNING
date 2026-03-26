package CLASS.DSA_MODULE_1.DSA_Strings;

public class Amazing_Subarrays {
    public static int solve1(String A) {
        int n = A.length();
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String s = A.substring(i, j + 1);
                char ch = s.charAt(0);
                if (vowels.indexOf(ch) >= 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int solve(String A) {
        int n = A.length();
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if(vowels.indexOf(ch)>=0){
                count+=(n-i);
                count %= 10003;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "ABEC";
        System.out.println(solve1(s));
        System.out.println(solve(s));
    }
}
