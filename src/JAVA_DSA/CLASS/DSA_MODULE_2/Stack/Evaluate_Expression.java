package CLASS.DSA_MODULE_2.Stack;

import java.util.Stack;

public class Evaluate_Expression {
    public static int solve(String[]A){
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            String ele = A[i];
            if(!ele.equals("+") && !ele.equals("-") && !ele.equals("*") && !ele.equals("/")){
                int num = Integer.parseInt(ele);
                st.push(num);
            }else{
                int op2 = st.pop();
                int op1 = st.pop();
                switch (ele){
                    case "+": st.push(op1+op2);break;
                    case "-": st.push(op1-op2);break;
                    case "*": st.push(op1*op2);break;
                    case "/": st.push(op1/op2);break;
                }
            }
        }
        return st.peek();
    }
    public static void main(String[] args){
        String[] arr = {"2", "1", "+", "3", "*"};
        String[] arr1 = {"-1"};
        System.out.println(solve(arr1));
    }
}
