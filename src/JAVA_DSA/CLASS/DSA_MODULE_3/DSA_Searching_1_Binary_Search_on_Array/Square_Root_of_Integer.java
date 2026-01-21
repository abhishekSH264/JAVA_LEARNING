package CLASS.DSA_MODULE_3.DSA_Searching_1_Binary_Search_on_Array;

public class Square_Root_of_Integer {
    public static int bruteforce2(int A) {
        int ans = -1;
        for (int i = 1; i * i <= A; i++) {
            ans = i;
        }
        return ans;
    }

    public static int solve(int A) {
        if (A == 0 || A == 1) {
            return A;
        }
        int start = 1, end = A, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sq = (long)mid * mid;
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
        System.out.println(bruteforce2(n));
        System.out.println(solve(n));
    }
}
