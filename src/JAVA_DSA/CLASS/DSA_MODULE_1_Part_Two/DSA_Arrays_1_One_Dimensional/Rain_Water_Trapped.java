package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

public class Rain_Water_Trapped {

    public static int bruteforce(int[]A){
        int n = A.length;
        int water = 0;
        for(int i=1;i<n-1;i++){
            int leftmax = Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                leftmax = Math.max(leftmax,A[j]);
            }
            int rightmax = Integer.MIN_VALUE;
            for(int j=i;j<n;j++){
                rightmax = Math.max(rightmax,A[j]);
            }
            water += Math.min(leftmax,rightmax)-A[i];
            //System.out.println(water);
        }
        return water;
    }
    public static int solve(int[]A){
        int n = A.length;
        int[] pf = new int[n];
        int[] sf = new int[n];
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        for(int i=0,j=n-1;i<n&&j>=0;i++,j--){
            leftMax = Math.max(leftMax,A[i]);
            pf[i] = leftMax;

            rightMax = Math.max(rightMax,A[j]);
            sf[j] = rightMax;

        }
        int water = 0;
        for(int i=0;i<n;i++){
            water+=Math.min(pf[i],sf[i])-A[i];
        }
        return water;
    }
    public static void main(String[] args) {
        int[] A = {4, 2, 0, 3, 2, 5};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));

    }
}
