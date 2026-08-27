package CLASS.DSA_MODULE_2.Stack;

import java.util.Stack;

public class Balanced_Paranthesis {
    public static int solve(String A) {
        int n = A.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if ((ch == '[') || (ch == '{') || (ch == '(')) {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return 0;
                } else {
                    if ((ch == ']' && st.pop() != '[') || (ch == '}' && st.pop() != '{') || (ch == ')' && st.pop() != '(')) {
                        return 0;
                    }
                }
            }
        }
        if (st.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String A = "{([])}";
        String B = "(){";
        String c = ")))))))";
        System.out.println(solve(A));
        System.out.println(solve(B));
        System.out.println(solve(c));
    }
}
