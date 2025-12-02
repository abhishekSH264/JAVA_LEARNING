package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Find_the_Nth_root_of_a_number_using_binary_search {
    public static int bruteforce(int n, int m) {
        for (int i = 1; i <= m; i++) {
            long power = power(i,n);
            if(power==m){
                return i;
            }else if(power > m){
                break;
            }
        }
        return -1;
    }
    public static long power(int x, int n) {
        long pow = 1;
        for (int i = 1; i <= n; i++) {
            pow *= x;
        }
        return pow;
    }
    public static int solve(int n, int m){
        int start = 1 , end = m;
        while(start<=end){
            int mid = start + (end - start) / 2;
            long power = power(mid,n);
            if(power==m){
                return mid;
            } else if (power < m) {
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
        System.out.println(solve(N,M));
    }
}
