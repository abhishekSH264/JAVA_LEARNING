package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Kth_Missing_Positive_Number {
    public static int bruteforce(int[]A,int K){
        int n = A.length;
        int num = 1;
        int i = 0;
        while (i < n && K > 0){
            if(A[i] == num){
                i++;
            }else{
                K--;
                if(K == 0){
                    return num;
                }
            }
            num++;
        }
        while (K > 0){
            num++;
            K--;
        }
        return num - 1;
    }
    public static int solve(int[]A,int K){
        int n = A.length;
        int start = 0, end = n-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            int miss = A[mid] - (mid+1);

            if(miss < K){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start + K;
    }
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 7, 11};
        int K = 5;
        System.out.println(bruteforce(A, K));
        System.out.println(solve(A, K));
    }
}
