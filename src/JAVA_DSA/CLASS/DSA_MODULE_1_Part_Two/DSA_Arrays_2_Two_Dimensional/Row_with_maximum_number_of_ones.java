package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_2_Two_Dimensional;

public class Row_with_maximum_number_of_ones {
    public static int solve(int[][] A) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int m = A[i].length;
            int count = 0;
            for (int j = 0; j < m; j++) {
                if(A[i][j]==1){
                    count++;
                }
            }
            if(count > ans){
                ans = count;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] A = {{0, 1, 1},
                    {0, 0, 1},
                    {0, 1, 1}};
        System.out.println(solve(A));
    }
}
