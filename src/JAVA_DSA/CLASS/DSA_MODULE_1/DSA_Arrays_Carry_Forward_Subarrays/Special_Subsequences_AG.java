package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Special_Subsequences_AG {
    public static long bruteforce(String s) {
        int n = s.length();
        int pair = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if (ch == 'A') {
                int count = 0;
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(j) == 'G') {
                        count++;
                    }
                }
                pair += count;
            }
        }
        return pair;
    }

    public static long solve(String s) {
        int n = s.length();
        long pair = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch=='A'){
                count++;
            }
            if(ch=='G'){
                pair+=count;
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        String s = "ABCGAG";
        System.out.println(bruteforce(s));
        System.out.println(solve(s));
    }
}
