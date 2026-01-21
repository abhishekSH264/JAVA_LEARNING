package CLASS.DSA_MODULE_3.DSA_Searching_1_Binary_Search_on_Array;

public class Last_Occurance {
    public static int bruteforce(int[] A, int K) {
        int n = A.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (A[i] == K) {
                ans = i;
            }
        }
        return ans;
    }

    public static int bruteforce2(int[] A, int K) {
        int n = A.length;
        for (int i = n - 1; i >= 0; i--) {
            if(A[i]==K){
                return i;
            }
        }
        return -1;
    }
    public static int lastOccurrence(int[]A,int K){
        int n = A.length;
        int start = 0, end = n-1,ans =-1;
        while (start<= end){
            int mid = start + (end - start) /2;
            if(A[mid]==K){
                ans = mid;
                start = mid+1;
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
        System.out.println(bruteforce2(A, K));
        System.out.println(lastOccurrence(A, K));
    }
}
