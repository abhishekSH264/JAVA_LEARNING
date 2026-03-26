package CLASS.DSA_MODULE_3.DSA_Lab_Session_on_Stacks;

import java.util.Arrays;
import java.util.Stack;

public class Nearest_greater_element_left {
    public static int[] brute(int[]A){
        int n = A.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = i; j >= 0; j--){
                if(A[j] > A[i]){
                    arr[i] = j;
                    break;
                }else{
                    arr[i] = -1;
                }
            }
        }
        return arr;
    }
    public static int[] solve(int[] A) {
        int n = A.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty()&&A[st.peek()]<= A[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i] = -1;
            }else{
                arr[i] = st.peek();
            }
            st.push(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {8, 6, 2, 5, 6, 5, 7, 4};
        System.out.println(Arrays.toString(brute(A)));
        System.out.println(Arrays.toString(solve(A)));
    }
}
