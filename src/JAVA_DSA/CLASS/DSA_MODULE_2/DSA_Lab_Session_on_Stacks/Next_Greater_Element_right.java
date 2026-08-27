package CLASS.DSA_MODULE_2.DSA_Lab_Session_on_Stacks;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_right {
    public static int[] bruteforce(int[] A) {
        int n = A.length;
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty()&&stack.peek() < A[i]){
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
        //       [5  10 10 -1}
        int[] A = {4, 5, 2, 10};
        System.out.println(Arrays.toString(bruteforce(A)));
    }
}
