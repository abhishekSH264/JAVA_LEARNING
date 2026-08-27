package CLASS.DSA_MODULE_2.DSA_Lab_Session_on_Stacks;

import java.util.Stack;

public class remove {
    public static String solve(String A){
        int n = A.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = A.charAt(i);
            if(!stack.isEmpty()&&ch==stack.peek()){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        System.out.println(stack);
        return "";
    }
    public static void main(String[] args){
        String a = "aaaaaaa";
        System.out.println(solve(a));
    }
}
