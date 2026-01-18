package CLASS.DSA_MODULE_3.DSA_Searching_1_Binary_Search_on_Array;

public class Square_Root_of_Integer {
    public static int solve(int A){
        int start = 1,end = A,ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            long sq = (long)mid * mid;
            if(sq==A){
                return mid;
            }else if(sq < A){
                ans = mid;
                start = mid+1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(solve(n));
    }
}
