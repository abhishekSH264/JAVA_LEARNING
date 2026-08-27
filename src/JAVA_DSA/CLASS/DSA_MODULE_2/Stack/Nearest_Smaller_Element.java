package CLASS.DSA_MODULE_2.Stack;

import java.util.Arrays;
import java.util.Stack;

public class Nearest_Smaller_Element {
    public static int[] solve(int[] A) {
        int n = A.length;
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int cur = A[i];
            while (!stack.isEmpty()&&cur<stack.peek()){
                stack.pop();
            }if(stack.isEmpty()){
                arr[i] = -1;
            }else{
                arr[i] = stack.peek();
            }
            stack.push(cur);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {4, 5, 2, 10, 8};
        int[] B = {39,27,11,4,24,32,32,1};
        System.out.println(Arrays.toString(solve(A)));
        
    }
}
