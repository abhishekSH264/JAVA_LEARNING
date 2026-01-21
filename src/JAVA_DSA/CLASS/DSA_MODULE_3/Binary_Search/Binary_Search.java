package JAVA_DSA.CLASS.DSA_MODULE_3.Binary_Search;

public class Binary_Search {
    public static int bruteforce(int[]A,int K){
        int n = A.length;
        for(int i = 0 ; i < n; i++){
            if(A[i]==K){
                return i;
            }
        }
        return -1;
    }
    public static int solve(int[]A,int K){
        int n = A.length;
        int start = 0, end = n-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(A[mid]==K){
                return mid;
            }else if(A[mid] < K){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {-1, 0, 3, 5, 9, 12};
        int K = 9;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A,K));
    }
}
