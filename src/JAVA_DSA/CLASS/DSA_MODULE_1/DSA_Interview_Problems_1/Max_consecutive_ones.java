package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

//Strivers series
public class Max_consecutive_ones {
    public static int solve(int[] A) {
        int n = A.length;
        int count = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(A[i]==0){
                ans = Math.max(ans,count);
                count = 0;
            }else{
                count++;
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1, 1, 0, 1, 1, 0, 1, 1, 1};
        int[] B = {1,1,1,0,0,1,1,1,1};
        System.out.println(solve(A));
        System.out.println(solve(B));
    }
}
