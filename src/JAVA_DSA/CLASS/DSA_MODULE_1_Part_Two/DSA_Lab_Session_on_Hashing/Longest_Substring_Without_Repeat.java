package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class Longest_Substring_Without_Repeat {
    public static boolean check(String s){
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        if(set.size()==n){
            return true;
        }else{
            return false;
        }
    }
    public static int bruteforce(String s){
        int n = s.length();
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub = s.substring(i,j+1);
                if(check(sub)){
                    ans = Math.max(ans,sub.length());
                }
            }
        }
        return ans;
    }
    public static int solve(String s){
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while (map.get(ch)>1){
                char tch = s.charAt(start);
                map.put(tch,map.get(tch)-1);
                start++;
            }
            ans = Math.max(ans, i-start+1);
        }
        return ans;
    }
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(bruteforce(s));
    }
}
