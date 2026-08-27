package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_2_Two_Dimensional;

public class Minimum_Swaps {
    public static int bruteForce(int[] A, int B) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] <= B) {
                count++;
            }
        }
        int ans = count;
        for (int i = 0; i <= n - count; i++) {
            int co = 0;
            for (int j = i; j < i + count; j++) {
                if (A[j] > B) {
                    co++;
                }
            }
            ans = Math.min(ans, co);
        }
        return ans;
    }

    public static int solve(int[] A, int B) {
        int n = A.length;
        int K = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] < B) {
                K++;
            }
        }
        int badCount = 0;
        for (int i = 0; i < K; i++) {
            if(A[i] < B){
                badCount++;
            }
        }
        System.out.println(badCount);
        int ans = badCount;
        int start = 1,end = K;
        while (end < n){
            if(A[start] - 1 > B){
                badCount--;
            }
            if(A[end] > B){
                badCount++;
            }
            ans = Math.min(ans,badCount);
            start++;end++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 12, 10, 3, 14, 10, 5};
        int B = 8;
        System.out.println(solve(A, B));
//        System.out.println(solve1(A, B));
        System.out.println(bruteForce(A, B));
    }
}
