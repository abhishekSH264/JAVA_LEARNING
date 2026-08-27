package CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Single_Number_III {
    /*
    Problem Description
    Given an array of positive integers A, two integers appear only once,
    and all the other integers appear twice.
    Find the two integers that appear only once.
    Note: Return the two numbers in ascending order.
    Problem Constraints
    2 <= |A| <= 100000
    1 <= A[i] <= 109
    Input Format
    The first argument is an array of integers of size N.
    Output Format
    Return an array of two integers that appear only once.
     */
    public static int[] bruteForce(int[] A) {
        int n = A.length;
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (A[j] == A[i]) {
                    count++;
                }
            }
            if (count == 1) {
                al.add(A[i]);
            }
        }
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }

    public static int[] better(int[] A) {
        int n = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < n; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        int K = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(A[i]) == 1) {
                ans[K++] = A[i];
            }
        }
        return ans;
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        int xor = 0;
        for (int i : A) {
            xor = xor ^ i;
        }

        int pos = -1;
        for (int i = 0; i < 32; i++) {
            if ((xor & (1 << i)) > 0) {
                pos = i;
                break;
            }
        }
        int a = 0, b = 0;
        for(int i = 0; i < n; i++){
            if((A[i] & (1 << pos)) > 0){
                a = a ^ A[i];
            }else{
                b = b ^ A[i];
            }
        }
        if(a < b){
            return new int[]{a,b};
        }
        return new int[]{b,a};
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 1, 2, 4};
        System.out.println(Arrays.toString(bruteForce(A)));
        System.out.println(Arrays.toString(better(A)));
        System.out.println(Arrays.toString(solve(A)));
    }
}
