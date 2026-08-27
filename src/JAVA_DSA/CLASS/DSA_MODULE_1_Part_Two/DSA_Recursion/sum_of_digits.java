package CLASS.DSA_MODULE_1_Part_Two.DSA_Recursion;

public class sum_of_digits {
    //iterative
    public static int iterative(int n) {
        int num = n;
        int digit = 0;
        while (num != 0){
            digit+=num % 10;
            num /= 10;
        }
        return digit;
    }
    //recursive method
    public static int solve(int n){
        if(n == 0){
            return 0;

        }
        return n % 10 + solve(n/10);
    }
    public static void main(String[] args) {
        int n = 46;
        System.out.println(iterative(n));
        System.out.println(solve(n));
    }
}
