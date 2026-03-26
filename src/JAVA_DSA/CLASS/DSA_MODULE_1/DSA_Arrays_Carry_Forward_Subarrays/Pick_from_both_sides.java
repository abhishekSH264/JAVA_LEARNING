package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Pick_from_both_sides {
    public static long solve(int[]A,int B){
        int n = A.length;
        long sum = 0;
        for(int i = 0 ; i < B; i ++){
            sum+=A[i];
        }
        long ans = sum;
        int i = B-1;
        int j = n-1;
        while(i >= 0){
            sum-=A[i];
            sum+=A[j];
            ans = Math.max(ans,sum);
            i--;j--;
        }
        return ans;
    }
    public static void main(String[] args){
        int[]A = {5, -2, 3 , 1, 2};
        int B = 3;
        System.out.println(solve(A,B));
    }
}
