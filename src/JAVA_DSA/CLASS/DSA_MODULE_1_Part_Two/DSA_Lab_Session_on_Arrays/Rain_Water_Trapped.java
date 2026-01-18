package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Arrays;

import java.util.Arrays;

public class Rain_Water_Trapped {
    public static int brute(int[] A) {
        int n = A.length;
        int water = 0;
        for (int i = 1; i < n - 1; i++) {

            int maxleft = Integer.MIN_VALUE;
            for (int j = 0; j <= i; j++) {
                maxleft = Math.max(maxleft, A[j]);
            }
            int maxright = Integer.MIN_VALUE;
            for (int k = i; k < n; k++) {
                maxright = Math.max(maxright, A[k]);
            }
            water += Math.min(maxleft, maxright) - A[i];
        }
        return water;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int prefix[] = new int[n];
        int maxleft = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxleft = Math.max(maxleft, A[i]);
            prefix[i] = maxleft;
        }
        int suffix[] = new int[n];
        int maxright = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            maxright = Math.max(maxright, A[i]);
            suffix[i] = maxright;
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));

        int water = 0;
        for (int i = 0; i < n; i++) {
            water+= Math.min(prefix[i],suffix[i]) - A[i];
        }
        return water;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 2};
//        System.out.println(brute(A));
        System.out.println(solve(A));
    }
}
