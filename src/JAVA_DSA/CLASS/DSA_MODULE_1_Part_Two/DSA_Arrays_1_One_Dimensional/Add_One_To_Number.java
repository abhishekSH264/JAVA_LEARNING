package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Add_One_To_Number {
    public static void reverse(int[] A, int i, int j) {
        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        int carry = 1;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            A[i] = A[i] + carry;
            if (A[i] > 9) {
                al.add(A[i] % 10);
                carry = A[i] / 10;
            } else {
                al.add(A[i]);
                carry = 0;
            }
        }
        if (carry > 0) {
            al.add(carry);
        }
        //System.out.println(al);
        Collections.reverse(al);
        while (al.size()>1&&al.get(0)==0){
            al.remove(0);
        }
        int[] arr = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {9, 9, 9};
        int[] c = {0,3,7,6,4,0,5,5,6};
        System.out.println(Arrays.toString(solve(c)));
    }
}
