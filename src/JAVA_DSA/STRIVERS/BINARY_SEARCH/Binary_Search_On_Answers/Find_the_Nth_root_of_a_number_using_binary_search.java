package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Find_the_Nth_root_of_a_number_using_binary_search {
    public static long power(int x,int m,int limit){
        long ans = 1;

        for(int i = 1; i <= m; i ++){
            ans*=x;
            if(ans > limit) return ans;
        }
        return ans;
    }
    public static int bruteforce(int A,int M){
        for(int i = 1; i <= A;i++){
            if(power(i,M,A)==A){
                return i;
            }
        }
        return -1;
    }
    public static int solve(int A,int x){
        int start = 1, end = A;
        while (start <= end){
            int mid = start + (end - start) / 2;
            long pow = power(mid,x,A);

            if(pow == A){
                return mid;
            }else if(pow < A){
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

        int a = 69;
        int b = 4;
        System.out.println(bruteforce(a, b));
        System.out.println(solve(M, N));
        System.out.println(solve(a,b));
    }
}
