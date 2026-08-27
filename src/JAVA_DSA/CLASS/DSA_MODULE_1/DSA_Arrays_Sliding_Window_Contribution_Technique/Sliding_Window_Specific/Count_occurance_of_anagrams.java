package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique.Sliding_Window_Specific;

import java.util.Arrays;
import java.util.HashMap;

public class Count_occurance_of_anagrams {
    public static int bruteforce(String s, String pat) {
        int n = s.length();
        int K = pat.length();
        char[] patternArr = pat.toCharArray();
        Arrays.sort(patternArr);
        String pattern = new String(patternArr);
        int count = 0;
        for (int i = 0; i <= n - K; i++) {
            String window = s.substring(i, i + K);
            char[] windowArr = window.toCharArray();
            Arrays.sort(windowArr);
            String sortedWindow = new String(windowArr);
            if (sortedWindow.equals(pattern)) {
                count++;
            }
        }
        return count;
    }

    public static int solve(String s, String pat) {
        int n = s.length();
        int K = pat.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < K; i++) {
            char ch = pat.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = map.size();
        int ans = 0;

        int i = 0, j = 0;
        while (j < n) {
            char right = s.charAt(j);
            if(map.containsKey(right)){
                map.put(right,map.get(right) - 1);

                if(map.get(right) == 0){
                    count--;
                }
            }
            int window = j - i + 1;

            if(window < K){
                j++;
            }else if (window == K){
                if(count == 0){
                    ans++;
                }
                char left = s.charAt(i);
                if(map.containsKey(left)){
                    map.put(left,map.get(left) + 1);

                    if(map.get(left) == 1){
                        count++;
                    }
                }
                i++;j++;
            }
        }
        return ans;
    }

    static void main() {
        String s = "forxxorfxdofr";
        String pat = "for";
//        System.out.println(bruteforce(s, pat));
        System.out.println(solve(s, pat));
    }
}
