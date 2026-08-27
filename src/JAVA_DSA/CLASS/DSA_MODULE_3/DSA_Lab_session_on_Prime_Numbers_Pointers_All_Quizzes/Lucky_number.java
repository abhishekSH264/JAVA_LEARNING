package CLASS.DSA_MODULE_3.DSA_Lab_session_on_Prime_Numbers_Pointers_All_Quizzes;

import java.util.Arrays;

public class Lucky_number {
    public static int factor(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static int bruteforce(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (factor(j) == 2 && i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                ans++;
            }
        }
        return ans;
    }

    //Optimize Approach
    public static int solve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        int[] divisor = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                for (int j = i; j <= n; j+=i) {
                    divisor[j] = divisor[j] + 1;
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++){
            if(divisor[i] ==2){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(bruteforce(n));
        System.out.println(solve(n));
    }
}
