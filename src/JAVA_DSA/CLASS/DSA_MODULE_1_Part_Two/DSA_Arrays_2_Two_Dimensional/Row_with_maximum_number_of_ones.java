package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_2_Two_Dimensional;

public class Row_with_maximum_number_of_ones {
    public static int bruteForce(int[][] A) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < n; i++) {
            int m = A[i].length;
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 1) {
                    count++;
                }
            }
            if (count > ans) {
                ans = count;
                row = i;
            }
        }
        return row;
    }

    public static int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int i = 0;
        int j = m - 1;
        int row = -1;
        while (i < n && j >= 0) {
            if (A[i][j] == 1) {
                row = i;
                j--;
            }else{
                i++;
            }
        }
        return row;
    }

    public static void main(String[] args) {
        int[][] A = {{0, 1, 1},
                     {0, 0, 1},
                     {0, 1, 1}};
        System.out.println(bruteForce(A));
        System.out.println(solve(A));
    }
}
