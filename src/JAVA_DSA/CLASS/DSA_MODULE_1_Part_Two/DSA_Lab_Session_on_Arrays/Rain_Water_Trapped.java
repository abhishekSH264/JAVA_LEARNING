package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Arrays;

import java.util.Arrays;

public class Rain_Water_Trapped {
    public static int bruteForce(int[] A) {
        int n = A.length;
        int water = 0;
        for (int i = 1; i < n - 1; i++) {
            int leftMax = 0;
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, A[j]);
            }
            int rightMax = 0;
            for (int j = i + 1; j < n; j++) {
                rightMax = Math.max(rightMax, A[j]);
            }
            int waterLevel = Math.min(leftMax,rightMax);
            if(waterLevel > A[i]){
                water+= waterLevel - A[i];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 2};
        System.out.println(bruteForce(A));
//        System.out.println(solve(A));
    }
}
