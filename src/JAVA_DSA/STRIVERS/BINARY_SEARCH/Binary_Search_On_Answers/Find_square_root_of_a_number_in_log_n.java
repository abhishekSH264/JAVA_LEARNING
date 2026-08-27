package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Find_square_root_of_a_number_in_log_n {
    public static int bruteforce(int A) {
        int ans = -1;
        for (int i = 1; i * i <= A; i++) {
            ans = i;
        }
        return ans;
    }

    public static int solve(int A) {
        int start = 1, end = A;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sq = mid * mid;
            if(sq <= A){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(bruteforce(n));
        System.out.println(solve(n));
    }
}
