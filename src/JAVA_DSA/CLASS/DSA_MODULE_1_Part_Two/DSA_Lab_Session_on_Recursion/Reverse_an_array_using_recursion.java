package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Recursion;

import java.util.Arrays;

public class Reverse_an_array_using_recursion {
    //iterative
    public static int[] iterative(int[]A) {
        int n = A.length;
        int start = 0; int end = n-1;
        while (start <= end){
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;end--;
        }
        return A;
    }
    //recursive
    public static void rev(int[]A,int i,int j){
        if(i >= j){
            return;
        }
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
        rev(A,i+1,j-1);
    }
    public static int[] solve(int[]A){
        int n = A.length;
        int i = 0, j = n-1;
        rev(A,i,j);
        return A;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(iterative(A)));
        System.out.println(Arrays.toString(solve(A)));
    }
}
