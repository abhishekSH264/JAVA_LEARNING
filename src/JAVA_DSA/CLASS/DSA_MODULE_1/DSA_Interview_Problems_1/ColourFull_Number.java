package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

import java.util.HashSet;

public class ColourFull_Number {
    public static int solve(int A) {
        String s = String.valueOf(A);
        int n = s.length();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                int digit = s.charAt(j) - '0';
                product *= digit;
                if(set.contains(product)){
                    return 0;
                }else{
                    set.add(product);
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int A = 23;
        System.out.println(solve(A));
    }
}
