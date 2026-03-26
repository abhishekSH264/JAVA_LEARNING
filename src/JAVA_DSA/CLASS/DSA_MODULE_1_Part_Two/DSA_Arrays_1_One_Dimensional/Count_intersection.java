package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.Arrays;

public class Count_intersection {
    public static int solve(int[][] A) {
        int n = A.length;
        int[][] intervals = new int[n][2];

        for (int i = 0; i < n; i++) {
            int type = A[i][0];
            int l = A[i][1];
            int r = A[i][2];

            if (type == 1) {
                l = 2 * l;
                r = 2 * r;
            } else if (type == 2) {
                l = 2 * l;
                r = 2 * r -1;
            } else if(type ==3){
                l = 2 * l +1;
                r = 2 * r;
            }else{
                 l = 2 * l +1;
                 r = 2 * r - 1;
            }
            intervals[i][0] = l;
            intervals[i][1] = r;
        }
        System.out.println(Arrays.deepToString(intervals));
        int count = 0;
        for(int i = 0; i  < intervals.length; i++){
            int l1 = intervals[i][0];
            int r1 = intervals[i][1];
            for(int j = i+1; j < n; j++){
                int l2 = intervals[j][0];
                int r2 = intervals[j][1];
                if(r1 >= l2 && r2 >= l1){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 1, 2}, {2, 2, 3}, {3, 2, 4}};
        System.out.println(solve(A));
    }
}
