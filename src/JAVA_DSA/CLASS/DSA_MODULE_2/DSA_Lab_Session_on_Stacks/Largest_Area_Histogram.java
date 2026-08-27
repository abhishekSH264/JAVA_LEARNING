package CLASS.DSA_MODULE_2.DSA_Lab_Session_on_Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Largest_Area_Histogram {
    public static int[] smallerLeft(int[] A) {
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && A[st.peek()] > A[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                arr[i] = -1;
            } else {
                arr[i] = st.peek();
            }
            st.push(i);
        }
        return arr;
    }

    public static int[] smallerRight(int[] A) {
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && A[st.peek()] > A[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                arr[i] = n;
            } else {
                arr[i] = st.peek();
            }
            st.push(i);
        }
        return arr;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int[] left = smallerLeft(A);
        int[] right = smallerRight(A);
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans,((right[i] - left[i] - 1) * A[i]));
        }
        return ans;
    }

    static void main() {
        int[] A = {2, 1, 5, 6, 2, 3};
        System.out.println(solve(A));
    }
}
