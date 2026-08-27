package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

//Maxconsecutive one by replacing and Max number of me se min ko return karna hai
public class Max_Consecutive_ones_swapping {
    public static int longestConsecutive(String s) {
        int n = s.length();
        int ans = Integer.MIN_VALUE;
        int totalOnes = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                totalOnes++;
            }
        }
        if (totalOnes == n) {
            return totalOnes;
        }
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                int l = i - 1;
                int left = 0;
                while (l >= 0 && s.charAt(l) == '1') {
                    left++;
                    l--;
                }
                int r = i + 1;
                int right = 0;
                while (r < n && s.charAt(r) == '1') {
                    right++;
                    r++;
                }
                int sum = left + right + 1;
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

    public static int solve(String s) {
        int n = s.length();
        int totalOnes = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1'){
                totalOnes++;
            }
        }
        return Math.min(totalOnes,longestConsecutive(s));
    }

    public static void main(String[] args) {
        String s = "111011101";
        System.out.println(longestConsecutive(s));
    }
}
