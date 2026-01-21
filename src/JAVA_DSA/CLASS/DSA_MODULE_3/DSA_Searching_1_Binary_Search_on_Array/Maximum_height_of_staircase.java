package CLASS.DSA_MODULE_3.DSA_Searching_1_Binary_Search_on_Array;

public class Maximum_height_of_staircase {
    public static int brute(int A) {
        int sum = 0;
        for (int i = 1; i <= A; i++) {
            sum += i;
            if (sum > A) {
                return i - 1;
            }
        }
        return -1;
    }

    public static int solve(int A) {
        int start = 1, end = A, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sum = (long) mid * (mid+1) / 2;
            if(sum <= A){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int A = 10;
        System.out.println(brute(A));
//        System.out.println(solve(A));
    }
}
