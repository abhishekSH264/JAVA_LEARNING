package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Arrays;
import java.util.*;
public class spiral_matrix {
    public static void print(int[][]A) {
        int n = A.length;
        int m = A[0].length;

        int colbegin = 0, colend = m - 1, rowbegin = 0, rowend = n - 1;
        ArrayList<Integer> al = new ArrayList<>();

        //printing the first row;
        for (int i = colbegin; i <= colend; i++) {
            int val = A[rowbegin][i];
            al.add(val);
        }
        rowbegin++;
        //print the last row;
        for (int i = rowbegin; i <= rowend; i++) {
            int val = A[i][colend];
            al.add(val);
        }
        colend--;
        for(int i=colend;i>=colbegin;i--){
            int val = A[rowend][i];
            al.add(val);
        }
        rowend--;
        for(int i=rowend;i>=rowbegin;i--){
            int val = A[i][colbegin];
            al.add(val);
        }
        System.out.println(al);
    }
    public static void main(String[] args){
        int[][]A = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};

        print(A);
    }
}
