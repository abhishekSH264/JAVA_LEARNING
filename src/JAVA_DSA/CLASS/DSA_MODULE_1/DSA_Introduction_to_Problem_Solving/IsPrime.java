package CLASS.DSA_MODULE_1.DSA_Introduction_to_Problem_Solving;

import java.util.Scanner;

public class IsPrime {
    public static int factors(int n) {
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

    public static int isPrime(int n) {
        if(factors(n) == 2){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
