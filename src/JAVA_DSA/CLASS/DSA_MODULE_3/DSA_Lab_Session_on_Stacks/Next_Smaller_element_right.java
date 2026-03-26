package CLASS.DSA_MODULE_3.DSA_Lab_Session_on_Stacks;

import java.util.Arrays;
import java.util.Stack;

public class Next_Smaller_element_right {
    public static int[] bruteforce(int[] A) {
        int n = A.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[i]) {
                    arr[i] = A[j];
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > A[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[i] = -1;
            }else{
                arr[i] = stack.peek();
            }
            stack.push(A[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        //        [2  2  -1 8   -1]
        int[] A = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(bruteforce(A)));
        System.out.println(Arrays.toString(solve(A)));
    }
}
