package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.Arrays;

public class Flip {
    public static int[] bruteforce(String s) {
        int n = s.length();
        int ans = 0;
        int start = -1, end = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int gain = 0;
                for (int k = i; k <= j; k++) {
                    if (s.charAt(k) == '0') {
                        gain++;
                    } else {
                        gain--;
                    }
                }
                if (gain > ans) {
                    ans = gain;
                    start = i;
                    end = j;
                }
            }
        }
        if (end == -1) {
            return new int[]{};
        }
        return new int[]{start + 1, end + 1};
    }

    public static int[] better(String s) {
        int n = s.length();
        int ans = 0;
        int start = -1, end = -1;

        for (int i = 0; i < n; i++) {
            int gain = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '0') {
                    gain++;
                } else {
                    gain--;
                }
                if (gain > ans) {
                    ans = gain;
                    start = i;
                    end = j;
                }
            }
        }
        if (end == -1) {
            return new int[]{};
        }
        return new int[]{start + 1, end + 1};
    }

    public static int[] solve(String s) {
        int n = s.length();
        int ans = 0;
        int start = -1;
        int end = -1;
        int tempStart = 0;
        int gain = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                gain++;
            } else {
                gain--;
            }
            if (gain > ans) {
                ans = gain;
                start = tempStart;
                end = i;
            }
            if (gain < 0) {
                gain = 0;
                tempStart = i + 1;
            }
        }
        if (end == -1) {
            return new int[]{};
        }
        return new int[]{start + 1, end + 1};
    }

    public static void main(String[] args) {
        String A = "010";
        System.out.println(Arrays.toString(bruteforce(A)));
        System.out.println(Arrays.toString(better(A)));
        System.out.println(Arrays.toString(solve(A)));
    }
}
