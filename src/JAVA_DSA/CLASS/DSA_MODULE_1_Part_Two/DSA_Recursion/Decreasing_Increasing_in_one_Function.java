package CLASS.DSA_MODULE_1_Part_Two.DSA_Recursion;

public class Decreasing_Increasing_in_one_Function {
    //iterative
    public static void iterative(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
    }
    public static void solve(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        solve(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 4;
        iterative(n);
        System.out.println();
        solve(n);
    }
}
