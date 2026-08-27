package STRIVERS.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Move_Zeros_to_End {
    public static int[] bruteforce(int[] A) {
        int n = A.length;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (A[i] > 0) {
                al.add(A[i]);
            }
        }
        for (int i = 0; i < al.size(); i++) {
            A[i] = al.get(i);
        }
        for (int i = al.size(); i < n; i++) {
            A[i] = 0;
        }
        return A;
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                j = i;
                break;
            }
        }
        if(j == -1){
            return A;
        }
        for (int i = j + 1; i < n; i++) {
            if (A[i] != 0) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j++;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {1, 0, 2, 3, 0, 4, 0, 1};
//        System.out.println(Arrays.toString(bruteforce(A)));
        System.out.println(Arrays.toString(solve(A)));
    }
}
