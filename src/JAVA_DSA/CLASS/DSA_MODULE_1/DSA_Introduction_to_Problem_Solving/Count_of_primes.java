package CLASS.DSA_MODULE_1.DSA_Introduction_to_Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class Count_of_primes {
    public static int factor(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if(i == n / i){
                    count+=1;
                }else{
                    count+=2;
                }
            }
        }
        return count;
    }
    public static int solve(int n){
        int count = 0;
        for(int i = 1; i <= n; i ++){
            if(factor(i) == 2){
                count++;
            }
        }
        return count;
    }
    public static int solve1(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0] = prime[1] = false;

        for(int i = 2; i * i <= n; i++){
            if(prime[i]){
                for(int j = i * i; j <= n; j+=i){
                    prime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2; i <=n; i++){
            if(prime[i]) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
        System.out.println(solve1(n));
    }
}
