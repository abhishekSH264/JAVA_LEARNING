package CLASS.DSA_MODULE_2.Stack;

import java.util.Arrays;
import java.util.Stack;

public class Warmer_Temperature {
    public static int[] solve(int[] A) {
        int n = A.length;
        int[] arr = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (A[j] > A[i]) {
                    arr[i] = j - i;
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] solve2(int[] A) {
        int n = A.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && A[st.peek()] <= A[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i] = 0;
            }else{
                arr[i] = st.peek() - i;
            }
            st.push(i);
        }
        return arr;
    }

    static void main() {

        int[] A = {73, 74, 75, 76, 77, 78, 79, 80};
        int[] B = {75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(solve(A)));
        System.out.println(Arrays.toString(solve(B)));
        System.out.println(Arrays.toString(solve2(A)));
        System.out.println(Arrays.toString(solve2(B)));

    }
}
