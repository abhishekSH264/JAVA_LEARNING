package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

import java.util.Arrays;

public class check_Anagrams {
    public static int solve(String A,String B){
        int n1 = A.length();
        int n2 = B.length();
        if(n1!=n2){
            return 0;
        }
        char[] s1 = A.toCharArray();
        char[] s2 = B.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i = 0; i < s1.length;i++){
            if(s1[i]!=s2[i]){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        String A = "secure";
        String B = "rescue";
        System.out.println(solve(A,B));
    }
}
