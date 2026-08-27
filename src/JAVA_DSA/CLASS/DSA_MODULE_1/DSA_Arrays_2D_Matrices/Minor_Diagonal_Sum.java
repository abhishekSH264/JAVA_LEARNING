package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

public class Minor_Diagonal_Sum {
    public static int solve(int[][]A){
        int n = A.length;
        int m = A[0].length;
        int sum = 0;
        int i = 0, j = m-1;
        while (i < n && j >= 0){
            sum+=A[i][j];
            i++;j--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] A = {{1, -2, -3},
                {-4, 5, -6},
                {-7, -8, 9}};
        System.out.println(solve(A));
    }
}
