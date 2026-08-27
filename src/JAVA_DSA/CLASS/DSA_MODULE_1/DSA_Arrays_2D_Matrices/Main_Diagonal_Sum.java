package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

public class Main_Diagonal_Sum {
    public static int bruteforce(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                if(i == j){
                    sum+=A[i][j];
                }
            }
        }
        return sum;
    }
    public static int solve(int[][] A){
        int n = A.length;
        int m = A[0].length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum+=A[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] A = {{1, -2, -3}, {4, 5, -6}, {-7, -8, 9}};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
