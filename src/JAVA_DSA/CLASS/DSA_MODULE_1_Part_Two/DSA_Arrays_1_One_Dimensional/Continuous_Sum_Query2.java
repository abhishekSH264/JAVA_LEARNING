package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.Arrays;

public class Continuous_Sum_Query2 {
    public static int[] solve1(int[]A,int[][]mat){
        int n = A.length;
        int m = mat.length;
        for(int i=0;i<m;i++){
            int start = mat[i][0];
            int end = mat[i][1];
            int value = mat[i][2];
            for(int j=start;j<=end;j++){
                A[j]+=value;
            }
        }
        return A;
    }
    public static int[] solve(int[]A,int[][]B){
        int n = A.length;
        int m = B.length;
        for(int i=0;i<m;i++){
            int start = B[i][0];
            int end = B[i][1];
            int value = B[i][2];
            A[start]+=value;
            if(end+1<n){
                A[end+1]-=value;
            }
        }
        //calculating the prefix sum
        for(int i=1;i<n;i++){
            A[i] = A[i-1]+A[i];
        }
        return A;
    }
    public static void main(String[] args){
        int[][] mat = {{1,3,2},{4,5,3},{3,6,-1}};
        int[]A = new int[7];
        System.out.println(Arrays.toString(solve(A,mat)));
    }
}
