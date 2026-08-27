package CLASS.DSA_MODULE_2.DSA_Searching_1_Binary_Search_on_Array;

public class First_Occurance {
    public static int bruteforce(int[]A,int K){
        int n = A.length;
        for(int i = 0; i < n; i ++) {
            if(A[i]==K){
                return i;
            }
        }
        return -1;
    }
    public static int solve(int[]A,int K){
        int n = A.length;
        int ans = -1;

        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(A[mid]==K){
                ans = mid;
                end = mid - 1;
            }else if(A[mid] < K){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {5, 7, 7, 8, 8, 10};
        int K = 7;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A, K));
    }
}
