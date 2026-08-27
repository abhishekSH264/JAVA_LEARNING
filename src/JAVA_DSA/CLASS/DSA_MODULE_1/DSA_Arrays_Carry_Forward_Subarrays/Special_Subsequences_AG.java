package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Special_Subsequences_AG {
    public static int bruteforce(String A) {
        int n = A.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if (ch == 'A') {
                int count = 0;
                for (int j = i + 1; j < n; j++) {
                    if (A.charAt(j) == 'G') {
                        count++;
                    }
                }
                ans += count;
            }
        }
        return ans;
    }

    public static int solve(String A) {
        int n = A.length();
        int ans = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if(ch == 'A'){
                count++;
            }
            if(ch=='G'){
                ans+=count;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "ABCGAG";
        System.out.println(bruteforce(s));
        System.out.println(solve(s));
    }
}
