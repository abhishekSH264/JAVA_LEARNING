package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Arrays;

import java.util.Arrays;

public class Next_Permutation {
    public static int[] reverse(int[]A,int i,int j){
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;j--;
        }
        return A;
    }
    public static int[] solve(int[]A){
        int n = A.length;
        //finding the dip index
        int dip = -1;
        for(int i=n-2;i>=0;i--){
            if(A[i]<A[i+1]){
                dip = i;
                break;
            }
        }
        if(dip==-1){
            return reverse(A,0,n-1);
        }
        //finding the nex greater number from the dip and interchanging it with dip elements;
        for(int i=n-1;i>=0;i--){
            if(A[i]>A[dip]){
                int temp = A[dip];
                A[dip] = A[i];
                A[i] = temp;
                break;
            }
        }
        reverse(A,dip+1,n-1);
        System.out.println(dip);
        System.out.println(Arrays.toString(A));
        return A;
    }
    public static void main(String[] args) {
        int[]A = {1, 2, 3};
        System.out.println(solve(A));
    }
}
