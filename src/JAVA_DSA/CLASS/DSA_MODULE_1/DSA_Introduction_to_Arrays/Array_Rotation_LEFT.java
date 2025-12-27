package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

import java.util.Arrays;

public class Array_Rotation_LEFT {
    //bruteforce
    public static int[] bruteforce(int[]A,int K){
        int n = A.length;
        for(int i = 0; i < K; i++){
            int temp = A[0];
            for(int j = 1; j < n; j++){
                A[j-1] = A[j];
            }
            A[n-1] = temp;
        }
        return A;
    }
    public static void reverse(int[]A,int i,int j){
        while (i < j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;j--;
        }
    }
    public static int[] solve(int[]A,int K){
        int n = A.length;
        K = K % n;
        reverse(A,0,K-1);
        reverse(A,K,n-1);
        reverse(A,0,n-1);
        return A;
    }
    public static void main(String[] args){
        int[]A = {1,2,3,4,5,6};
        int K = 3;
        System.out.println(Arrays.toString(bruteforce(A,K)));
    }
}
