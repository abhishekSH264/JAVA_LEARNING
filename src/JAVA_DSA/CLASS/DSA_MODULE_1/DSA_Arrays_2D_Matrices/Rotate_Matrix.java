package CLASS.DSA_MODULE_1.DSA_Arrays_2D_Matrices;

import java.util.Arrays;

public class Rotate_Matrix {
    public static void reverse(int[] A,int i,int j) {
        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }

    public static void transpose(int[][] A) {
        int n = A.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int tmp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = tmp;
            }
        }
        for(int i = 0 ; i < n; i++){
            reverse(A[i],0,n-1);
        }
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{1, 2}, {3, 4}};
        transpose(B);
    }
}
