package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Find_square_root_of_a_number_in_log_n {
    //BruteForce
    public static int brute(int n) {
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            if(i * i <= n){
                ans = i;
            }else{
                break;
            }
        }
        return ans;
    }
    public static int solve(int n){
        int start = 1,end = n;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            long sq = (long)mid * mid;
            if(sq==n){
                return mid;
            }else if(sq<=n){
                ans = mid;
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
//        System.out.println(brute(n));
        System.out.println(solve(n));
    }
}
