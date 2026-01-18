package CLASS.DSA_MODULE_3.DSA_Searching_1_Binary_Search_on_Array;

public class Maximum_height_of_staircase {

    //Bruteforce
    public static int bruteforce(int A) {
        long sum = 0;
        for (int i = 1; i <= A; i++) {
            sum = (long) i * (i + 1) / 2;
            if (sum > A) {
                return i - 1;
            }
        }
        return -1;
    }

    public static int solve(int A) {
        int start = 1, end = A;
        long sum = 0;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            sum = (long) mid * (mid + 1) / 2;
            if(sum<= A){
                ans = mid;
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int A = 10;
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
