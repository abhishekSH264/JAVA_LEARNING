package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_2_Two_Dimensional;

public class Sum_of_all_Submatrices {
    public static int solve(int[][] A) {
        int n = A.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                int topLeft = (i+1) * (j+1);
                int bottomRight = (n-i)*(n-j);
                ans += A[i][j] * (topLeft * bottomRight);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{4, 9, 6},
                       {5, -1, 2}};
        System.out.println(solve(mat));
    }
}
