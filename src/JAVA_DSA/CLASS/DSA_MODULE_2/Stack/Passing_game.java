package CLASS.DSA_MODULE_2.Stack;

import java.util.Stack;

public class Passing_game {
    public static int solve(int A,int B,int[]C){
        Stack<Integer> stack = new Stack<>();
        stack.push(B);
        for(int i=0;i<A;i++){
            if(C[i]==0){
                stack.pop();
            }else{
                stack.push(C[i]);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args){
        int A = 10;
        int B =  23;
        int[] C = {86, 63, 60, 0, 47, 0, 99, 9, 0, 0};
        System.out.println(solve(A,B,C));
    }
}
