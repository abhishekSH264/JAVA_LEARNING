package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Special_Subsequences_AG {
    public static int bruteforce(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                for (int j = i + 1; j < n; j++) {
                    if(s.charAt(j)=='G'){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static int solve(String s){
        int n = s.length();
        int count = 0;
        int pair = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i)=='A'){
                count++;
            }
            if(s.charAt(i)=='G'){
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
