package CLASS.DSA_MODULE_3.DSA_Maths_Combinatorics_Basics_Prime_Numbers;

public class n_c_r_mod_m {
    public static int solve(int A, int B, int C) {
        int[][] ans = new int[A + 1][B + 1];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j <= Math.min(i, B); j++) {
                if (j == 0 || j == i)
                {
                    ans[i][j] = 1;
                }else{
                    ans[i][j] = (int) (((long)ans[i - 1][j - 1] + ans[i - 1][j]) % C);
                }
            }
        }
        return ans[A][B];
    }

    public static void main(String[] args) {
        int A = 5;
        int B = 2;
        int m = 13;
        System.out.println(solve(A, B, m));
    }
}
