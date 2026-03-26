package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_2_Two_Dimensional;

public class Search_in_a_row_wise_and_column_wise_sorted_matrix {
    public static int bruteforce(int[][] A, int B) {
        int n = A.length;
        int val = -1;
        for (int i = 0; i < n; i++) {
            int m = A[i].length;
            for (int j = 0; j < n; j++) {
                if (A[i][j] == B) {
                    val = (i + 1) * 1009 + (j + 1);
                }
            }
        }
        return val;
    }

    public static int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        int row = 0, col = m - 1;
        int ans = Integer.MAX_VALUE;
        while (row < n && col >= 0) {
            int val = A[row][col];
            if (val == B) {
                int encoded = (row + 1) * 1009 + (col + 1);
                ans = Math.min(ans, encoded);
                col--;
            } else if (val > B) {
                col--;
            } else {
                row++;
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int B = 2;
        int[][] mat1 = {{2, 3, 6, 7}, {2, 3, 4, 5}};
        int c = 10;
        System.out.println(bruteforce(mat, B));
        System.out.println(solve(mat, B));
    }
}
