package CLASS.DSA_MODULE_1.DSA_Sorting_Basics;

import java.util.Arrays;

public class Elements_Removal {
    public static void reverse(int[]A){
        int n = A.length;
        int i = 0;
        int j = n-1;

        while (i < j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;j--;
        }
    }
    public static int bruteforce(int[]A){
        int n = A.length;
        Arrays.sort(A);
        reverse(A);
        int cost = 0;
        for(int i = 0; i < n; i ++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum+=A[j];
            }
            cost+=sum;
        }
        return cost;
    }
    public static int solve(int[]A){
        int n = A.length;
        Arrays.sort(A);
        reverse(A);
        int cost = 0;
        for(int i = 0 ; i < n; i++){
            cost+=A[i]*(i+1);
        }
        return cost;
    }
    public static void main(String[] args){
        int[] A = {4,6,1};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
