package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_2_Two_Dimensional;

public class Minimum_Swaps {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int smallCount = 0;
        for (int i = 0; i < n; i++) {
            if(A[i] <= B){
                smallCount++;
            }
        }
        int start = 0;
        int end = smallCount-1;
        int ans = Integer.MAX_VALUE;
        while (end < n){
            int count = 0;
            for(int i=start;i<=end;i++){
                if(A[i] > B){
                    count++;
                }
            }
            ans = Math.min(ans,count);
            start++;end++;
        }
        //System.out.println(smallCount);
        return ans;
    }
    public static int solve1(int[]A,int B){
        int n = A.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(A[i] <= B){
                count++;
            }
        }
        //System.out.println(count);
        int badcount = 0;
        for(int i=0;i<count;i++){
            if(A[i] > B){
                badcount++;
            }
        }
        int ans = badcount;
        int start = 1;
        int end = count;
        while (end  < n){
            if(A[start-1] >B) badcount--;
            if(A[end] > B) badcount++;

            ans = Math.min(ans,badcount);
            start++;end++;
        }
        //System.out.println(badcount);
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1, 12, 10, 3, 14, 10, 5};
        int B = 8;
        //System.out.println(solve(A,B));
        System.out.println(solve1(A,B));
    }
}
