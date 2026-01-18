package CLASS.DSA_MODULE_1.DSA_Strings;

public class Amazing_Subarrays {
    public static int solve(String A) {
        int n = A.length();
        long count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = A.substring(i, j + 1);
                char ch = sub.charAt(0);
                if (vowels.indexOf(ch) >= 0) {
                    count++;
                }
            }
        }
        return (int) count % 10003;
    }

    public static int solve1(String A) {
        int n = A.length();
        String vowels = "aeiouAEIOU";
        long count = 0;
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if(vowels.indexOf(ch)>=0){
                count += (n-i);
                count%=10003;
            }
        }
        return (int) count;
    }

    public static void main(String[] args) {
        String s = "ABEC";
        System.out.println(solve1(s));
    }
}
