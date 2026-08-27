package CLASS.DSA_MODULE_1_Part_Two.DSA_Recursion;

public class Fibonacci_Series {
    //iterative method
    public static int iterative(int n) {
        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    //recursive method
    public static int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(iterative(n));
        System.out.println(fib(n));
    }
}
