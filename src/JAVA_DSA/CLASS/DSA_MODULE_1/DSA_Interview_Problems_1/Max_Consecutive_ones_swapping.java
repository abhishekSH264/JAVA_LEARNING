package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

//Maxconsecutive one by replacing and Max number of me se min ko return karna hai
public class Max_Consecutive_ones_swapping {
    public static int maxConsecutive(String A) {
        int n = A.length();
        int totalones = 0;
        for (int i = 0; i < n; i++) {
            if(A.charAt(i)=='1'){
                totalones++;
            }
        }
        if (totalones == n) {
            return n;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '0') {
                int l = 0;
                int left = i - 1;
                while (left >= 0 && A.charAt(left) == '1') {
                    l++;
                    left--;
                }
                int r = 0;
                int right = i + 1;
                while (right < n &&A.charAt(right) == '1') {
                    r++;
                    right++;
                }
                int count = l + r + 1;
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    public static int solve(String A) {
        int n = A.length();
        int totalones = 0;
        for (int i = 0; i < n; i++) {
            if(A.charAt(i)=='1'){
                totalones++;
            }
        }
        int maxConsecutive = maxConsecutive(A);
        return Math.min(totalones, maxConsecutive);
    }

    public static void main(String[] args){
        String s = "111011101";
        System.out.println(solve(s));
    }
}
