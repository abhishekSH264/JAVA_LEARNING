package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.Arrays;

public class Continuous_Sum_Query1 {
    public static int[] solve(int[]A,int[][]mat){
        int n = A.length;
        int m = mat.length;
        for(int i=0;i<m;i++){
            int start = mat[i][0];
            int value = mat[i][1];
            for(int j=start;j<n;j++){
                A[j]+=value;
            }
        }
        return A;
    }
    public static int[] solve1(int[]A,int[][]mat){
        int n = A.length;
        int m = mat.length;
        for(int i=0;i<m;i++){
            int index = mat[i][0];
            int value = mat[i][1];
            A[index]+=value;
        }
        //creating the prefix sum array
        for(int i=1;i<n;i++){
            A[i] = A[i-1]+A[i];
        }
        return A;
    }
    public static void main(String[] args){
        int[][] mat = {{1,3},{4,-2},{3,1}};
        int[]A = new int[7];
        //System.out.println(Arrays.toString(solve(A,mat)));
        System.out.println(Arrays.toString(solve1(A,mat)));
    }
}
