package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

public class MaxSubaaraySum {
    //Extremely Bruteforce
    public static int bruteforce(int[] A, int B) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }
                if (sum <= B) {
                    ans = Math.max(ans, sum);
                }
            }
        }
        return ans;
    }

    //carry forward
    public static int carryForward(int[] A, int B) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                if (sum <= B) {
                    ans = Math.max(ans, sum);
                }
            }
        }
        return ans;
    }

    public static int better(int[] A, int B) {
        int n = A.length;
        int[] psum = new int[n];
        psum[0] = A[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + A[i];
        }
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    sum = psum[j];
                } else {
                    sum = psum[j] - psum[i - 1];
                }
                if (sum <= B) {
                    ans = Math.max(ans, sum);
                }
            }
        }
        return ans;
    }
    public static int solve(int[]A,int B){
        int n = A.length;
        int left = 0;
        int sum = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            sum+=A[i];
            while(sum > B){
                sum-=A[left];
                left++;
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {2, 1, 3, 4, 5};
        int B = 12;
        System.out.println(bruteforce(A, B));
        System.out.println(carryForward(A, B));
        System.out.println(better(A, B));
        System.out.println(solve(A, B));
    }
}
