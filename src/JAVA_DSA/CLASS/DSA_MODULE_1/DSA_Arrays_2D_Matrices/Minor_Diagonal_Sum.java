package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

public class Minor_Diagonal_Sum {
    public static int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int row = 0;
        int col = m - 1;
        int sum = 0;
        while (row < n && col >= 0){
            sum+=A[row][col];
            row++;col--;
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
