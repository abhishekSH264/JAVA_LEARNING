package CLASS.DSA_MODULE_1_Part_Two.DSA_Recursion;

public class Factorial {
    //iterative method
    public static int iterative(int n) {
        int ans = 1;

        for (int i = n; i > 0; i--) {
            ans *= i;
        }
        return ans;
    }

    //recursive
    public static int solve(int n) {
        if(n == 1){
            return 1;
        }
        return n * solve(n-1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(iterative(n));
        System.out.println(solve(n));
    }
}
