package CLASS.DSA_MODULE_2.DSA_Lab_Session_on_Stacks;

import java.util.Stack;

public class Double_Character_Trouble {
    public static String solve(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()&& st.peek().equals(ch)){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args){
        String A = "abccbc";
        System.out.println(solve(A));
    }
}
