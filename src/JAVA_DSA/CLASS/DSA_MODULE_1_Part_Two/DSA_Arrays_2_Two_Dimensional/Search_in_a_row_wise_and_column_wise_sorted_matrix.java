package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_2_Two_Dimensional;

public class Search_in_a_row_wise_and_column_wise_sorted_matrix {
    public static int bruteforce(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == B) {
                    int calc = ((i + 1) * 1009 + (j + 1));
                    index = Math.min(index, calc);
                }
            }
        }
        if (index > -1) {
            return index;
        } else {
            return -1;
        }
    }

    public static int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        int row = 0;
        int col = m - 1;
        int ans = Integer.MAX_VALUE;
        while (row < n && col >= 0) {
            if(A[row][col]==B){
                ans = Math.min(ans,((row+1)*1009+(col+1)));
                col--;
            } else if (A[row][col] > B) {
                col--;
            }else{
                row++;
            }
        }
        if(ans > 0 && ans!=Integer.MAX_VALUE){
            return ans;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int B = 2;
        int[][] mat1 = {{2, 3, 6, 7}, {2, 3, 4, 5}};
        int c = 10;
//        System.out.println(bruteforce(mat,B));
        System.out.println(solve(mat1, c));
    }
}
