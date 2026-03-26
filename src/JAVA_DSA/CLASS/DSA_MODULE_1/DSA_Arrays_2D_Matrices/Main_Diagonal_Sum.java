package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

public class Main_Diagonal_Sum {
    public static int solve(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0 ; i < n; i++){
            sum+=mat[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] A = {{1, -2, -3}, {4, 5, -6}, {-7, -8, 9}};
        System.out.println(solve(A));
    }
}
