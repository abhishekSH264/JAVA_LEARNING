package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

import javax.swing.plaf.IconUIResource;

public class Count_of_elements {
    public static int solve(int[] A) {
        int n = A.length;
       int max = Integer.MIN_VALUE;
       for(int i : A){
           if(i > max) max = i;
       }
       int count = 0;
       for(int i : A){
           if(max > i){
               count++;
           }
       }
       return count;
    }
    public static void main(String[] args){
        int[] A = {3, 1, 2};
        System.out.println(solve(A));
    }
}
