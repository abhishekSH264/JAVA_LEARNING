package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

public class MaxSubaaraySum {
    //Extreme Bruteforce
    public static int bruteforce(int A, int B, int[] C) {
        int n = C.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += C[k];
                }
                if (sum <= B) {
                    ans = Math.max(ans, sum);
                }
            }
        }
        return ans;
    }

    public static int betterSolution(int A, int B, int[] C) {
        int n = C.length;
        int[] psum = new int[n];
        psum[0] = C[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + C[i];
        }
        int ans = 0;
        for (int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                if(i==0){
                    sum = psum[j];
                }else{
                    sum = psum[j]-psum[i-1];
                }
                if(sum<=B){
                    ans = Math.max(ans, sum);
                }
            }
        }
        return ans;
    }
    public static int carryforward(int A, int B, int[] C) {
        int n = C.length;
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum+=C[j];
                if(sum <= B){
                    ans = Math.max(ans, sum);
                }
            }
        }
        return ans;
    }
    public static int solve(int A, int B, int[] C) {
        int n = C.length;
        int ans = 0;
        int left = 0;
        int sum = 0;
        for(int i = 0 ; i < n ; i ++){
            sum+=C[i];
            while(sum > B){
                sum -= C[left];
                left++;
            }
            if(sum<=B){
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] C = {2, 1, 3, 4, 5};
        int A = C.length;
        int B = 12;
        System.out.println(bruteforce(A, B, C));
        System.out.println(carryforward(A,B,C));
        System.out.println(betterSolution(A,B,C));
        System.out.println(solve(A,B,C));
    }
}
