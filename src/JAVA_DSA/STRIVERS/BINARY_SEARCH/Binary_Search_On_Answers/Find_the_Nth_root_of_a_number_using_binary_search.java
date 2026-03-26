package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Find_the_Nth_root_of_a_number_using_binary_search {
    public static long power(int x,int n){
        long ans = 1;
        for(int i = 1; i <=n; i++){
            ans *= (long)x;
        }
        return ans;
    }
    public static int bruteforce(int m, int n) {
        for (int i = 1; i <= m; i++) {
            if(power(i,n)==m){
                return i;
            }
        }
        return -1;
    }
    public static int solve(int m,int n){
        int start = 1,end = m;
        while (start <= end){
            int mid = start + (end - start) / 2;
            long pow = power(mid,n);
            if(pow==m){
                return mid;
            }else if(pow < m){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int M = 27;
        int N = 3;
        System.out.println(bruteforce(M, N));
//        System.out.println(solve(M, N));
    }
}
