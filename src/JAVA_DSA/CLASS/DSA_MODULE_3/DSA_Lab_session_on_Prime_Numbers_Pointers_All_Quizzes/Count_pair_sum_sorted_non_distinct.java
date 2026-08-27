package CLASS.DSA_MODULE_3.DSA_Lab_session_on_Prime_Numbers_Pointers_All_Quizzes;

public class Count_pair_sum_sorted_non_distinct {
    //bruteforce
    public static int bruteforce(int[] A, int K) {
        int count = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(A[i]+A[j] == K){
                    count++;
                }
            }
        }
        return count;
    }
    public static int solve(int[]A,int K){
        int mod = 1000000007;
        long ans = 0;
        int n = A.length;
        int start = 0, end = n-1;
        while (start <= end){
            int sum = A[start] + A[end];
            if(sum == K){
                int leftVal = A[start];
                int rightVal = A[end];
                int leftCount = 0;
                int rightCount = 0;

                if(leftVal == rightVal){
                    long count = end - start + 1;
                    ans+= count * (count-1) / 2;
                    ans = ans % mod;
                    break;
                }
                while (start <= end && A[start] == leftVal){
                    leftCount++;
                    start++;
                }
                while (start <= end && A[end]==rightVal){
                    rightCount++;
                    end--;
                }
                ans+= (long)leftCount * rightCount;
            }else if(sum < K){
                start++;
            }else{
                end --;
            }
        }
        return (int)(ans % mod);
    }
    public static void main(String[] args) {
        int[] A = {1, 1, 2, 2, 3, 3, 4, 4, 4, 6};
        int K = 5;
        System.out.println(bruteforce(A,K));
        System.out.println(solve(A,K));
    }
}
