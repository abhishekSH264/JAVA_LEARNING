package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

public class max_consecutive_ones_replacing {
    public static int solve(int[]A){
        int n = A.length;
        int ans = 0;
        int totalone = 0;
        for(int i = 0; i < n; i++){
            if(A[i]==1){
                totalone++;
            }
        }
        if(totalone==n){
            return totalone;
        }
        for(int i = 0; i < n; i++){
            if(A[i]==0){
                int l = 0;
                int left = i-1;
                while (left >= 0 && A[left]==1){
                    l++;
                    left--;
                }
                int r = 0;
                int right = i+1;
                while(right < n && A[right]==1){
                    r++;
                    right++;
                }
                int count = l+r+1;
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]A = {1,1,0,1,1,0,1,1,1};
        System.out.println(solve(A));
    }
}
