package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Add_one_to_number {
    public static int[] solve(int[] A) {
        int n = A.length;
        ArrayList<Integer> al = new ArrayList<>();
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int digit = A[i] + carry;
            if (digit > 9) {
                al.add(digit % 10);
                carry = digit / 10;
            } else {
                al.add(digit);
                carry = 0;
            }
        }
        if (carry > 0) {
            al.add(carry);
        }
        Collections.reverse(al);
        int start = 0;
        while (start < al.size() - 1 && al.get(start) == 0) {
            start++;
        }
        System.out.println(start + " size of the ans array " + al.size());
        int[] ans = new int[al.size() - start];
        for (int i = start; i < al.size(); i++) {
            ans[i-start] = al.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[] B = {9, 9, 9};
        int[] C = {0, 3, 7, 6, 4, 0, 5, 5, 5};
        System.out.println(Arrays.toString(solve(C)));
    }
}
